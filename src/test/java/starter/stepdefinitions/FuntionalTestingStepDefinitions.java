package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import starter.steps.LoginSteps;

public class FuntionalTestingStepDefinitions {
    @Steps
    LoginSteps loginSteps;

    @Given("Mario is on the OrangeHRM login page")
    public void marioIsOnTheLoginPage() {
        loginSteps.openLoginPage();
    }

    @When("he enters username {string} and password {string}")
    public void heEntersUsernameAndPassword(String username, String password) {
        loginSteps.loginWithCredentials(username, password);
    }

    @Then("he should be redirected to the home page")
    public void heShouldBeRedirectedToTheHomePage() {
        loginSteps.shouldSeeHomePage();
    }

    @Then("he should see an error message indicating {string}")
    public void heShouldSeeAnErrorMessage(String errorMessage) {
        loginSteps.shouldSeeLoginError(errorMessage);
    }
}
