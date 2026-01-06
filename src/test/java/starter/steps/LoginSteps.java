package starter.steps;

import net.serenitybdd.annotations.Step;
import starter.pages.HomePage;
import starter.pages.LoginPage;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertAll;


public class LoginSteps {
    LoginPage loginPage;
    HomePage homePage;

    @Step("Open OrangeHRM login page")
    public void openLoginPage() {
        loginPage.open();
    }

    @Step("Login with username {0} and password {1}")
    public void loginWithCredentials(String username, String password) {
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
        loginPage.clickLogin();
    }

    @Step("User should be on home page")
    public void shouldSeeHomePage() {
        assertTrue(homePage.isDisplayed());
    }

    @Step("User should see invalid credentials error")
    public void shouldSeeLoginError(String expectedMessage) {
        assertAll(
                () -> assertTrue(loginPage.isErrorMessageDisplayed(), "Error message should be visible"),
                () -> assertThat(
                        "Error message should contain: " + expectedMessage,
                        loginPage.errorMessage(),
                        containsString(expectedMessage)
                )
        );
    }
}
