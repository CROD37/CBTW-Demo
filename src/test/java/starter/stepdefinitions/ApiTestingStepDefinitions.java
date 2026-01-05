package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.mapper.ObjectMapperType;
import org.hamcrest.Matchers;
import starter.petsotore.Pet;


import static net.serenitybdd.rest.SerenityRest.then;
import static net.serenitybdd.rest.SerenityRest.when;
import static net.serenitybdd.rest.SerenityRest.given;


public class ApiTestingStepDefinitions {

    Long newId;

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
}
