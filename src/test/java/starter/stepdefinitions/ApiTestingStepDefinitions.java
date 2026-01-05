package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.mapper.ObjectMapperType;
import net.serenitybdd.rest.SerenityRest;
import org.hamcrest.Matchers;
import starter.petstore.Pet;


import static net.serenitybdd.rest.SerenityRest.then;
import static net.serenitybdd.rest.SerenityRest.when;
import static net.serenitybdd.rest.SerenityRest.given;


public class ApiTestingStepDefinitions {

    Long newId;
    Long petId;

    @Given("the pet {string} is {string} in the pet store")
    public Long thePetIsAvailableInThePetStore(String petName, String status) {

        Pet pet = new Pet(petName, status);

        newId = given()
                .baseUri("https://petstore.swagger.io")
                .basePath("/v2/pet")
                .body(pet, ObjectMapperType.GSON)
                .accept(ContentType.JSON)
                .contentType(ContentType.JSON).post().getBody().as(Pet.class, ObjectMapperType.GSON).getId();
        return newId;
    }

    @When("I search for the pet using its identifier")
    public void iSearchForThePetUsingItsIdentifier() {
        when().get("/" + newId);
    }

    @Then("I should see the pet {string} as the result with status {string}")
    public void iShouldSeeThePetAsTheResult(String petResult, String status) {
        then().statusCode(200).body("name", Matchers.equalTo(petResult)).body("status", Matchers.equalTo(status));
    }

    @Given("there is no pet with identifier {long}")
    public void thereIsNoPetWithIdentifier(Long petId) {
        this.petId = petId;
    }

    @When("I search for the pet using that identifier")
    public void iSearchForThePetUsingThatIdentifier() {
        SerenityRest
                .given()
                .baseUri("https://petstore.swagger.io")
                .basePath("/v2/pet/{petId}")
                .pathParam("petId", petId)
                .when()
                .get();
    }

    @Then("I should be informed that the pet was not found")
    public void iShouldBeInformedThatThePetWasNotFound() {
        then().statusCode(404).body("message",Matchers.equalTo("Pet not found"));
    }
}
