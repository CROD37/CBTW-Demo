package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class HomePage extends PageObject {

    @FindBy(css = "h6.oxd-text")
    WebElementFacade dashboardHeader;


    public boolean isDisplayed() {
        return $(dashboardHeader).isVisible();
    }
}
