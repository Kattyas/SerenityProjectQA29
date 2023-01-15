package org.fasttrackit.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountPage extends PageObject {

    @FindBy(css = ".hello strong")
    private WebElementFacade welcomeTextElement;

    @FindBy(css = ".nav-5 .has-children")
    private WebElementFacade saleElement;

    @FindBy(css = ".box-info .box-head a")
    private WebElementFacade manageAdress;





    public boolean isWelcomeText(String userName) {
        return welcomeTextElement.containsOnlyText("Hello, " + userName + "!");
    }

    public String getWelcomeText(){
        return welcomeTextElement.getText();
    }

    public void userIsLoggedIn(String userName){
        welcomeTextElement.shouldContainOnlyText("Hello, " + userName + "!");
    }

    public void clickOnSale(){
        saleElement.click();
    }

    public void clickManageAdress(){
        manageAdress.click();
    }









}
