package starter.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class LoginPage extends PageObject {
    @FindBy(name = "username")
    WebElementFacade usernameField;
    @FindBy(name = "password")
    WebElementFacade passwordField;
    @FindBy(css = "button[type='submit']")
    WebElementFacade loginButton;
    @FindBy(css = ".oxd-alert.oxd-alert--error")
    WebElementFacade errorMessage;

    public void enterUsername(String username) {
        $(usernameField).type(username);
    }

    public void enterPassword(String password) {
        $(passwordField).type(password);
    }

    public void clickLogin() {
        $(loginButton).waitUntilClickable().click();
    }

    public boolean isErrorMessageDisplayed() {
        return $(errorMessage).waitUntilVisible().isDisplayed();
    }
    public String errorMessage() {
        return $(errorMessage).getText();
    }
}
