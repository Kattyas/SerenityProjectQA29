package org.fasttrackit.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends PageObject {



    @FindBy(id = "firstname")
    private WebElementFacade nameField;

    @FindBy(id = "lastname")
    private WebElementFacade lastNameField;

    @FindBy(id = "email_address")
    private WebElementFacade emailField;

    @FindBy(id = "password")
    private WebElementFacade passField;

    @FindBy(id = "confirmation")
    private WebElementFacade confPassField;

    @FindBy(id = "form-validate")
    private  WebElementFacade regButton;






    public void setNameField(String value){
        typeInto(nameField, value);
    }

    public void setLastNameField(String value){
        typeInto(lastNameField, value);
    }

    public void setEmailAdress(String value){
        typeInto(emailField, value);
    }

    public void setPassword(String value){
        typeInto(passField, value);
    }

    public void setConfPassword(String value){
        typeInto(confPassField,value);
    }

    public void clickRegButton(){
        clickOn(regButton);
    }







































}
