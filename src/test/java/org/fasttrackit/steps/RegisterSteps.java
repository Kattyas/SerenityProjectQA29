package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.pages.RegisterPage;

public class RegisterSteps extends ScenarioSteps {

    private HomePage homePage;
    private RegisterPage registerPage;

    @Step
    public void navigateToRegisterPage() {
        homePage.open();
        homePage.clickOnAccountButton();
        homePage.clickRegisterLink();
    }

    @Step
    public void typeFirstName(String firstname){
        registerPage.setNameField(firstname);
    }

    @Step
    public void typeLastName(String lastname){
        registerPage.setLastNameField(lastname);
    }

    @Step
    public void typeEmailField(String emailAdress){
        registerPage.setEmailAdress(emailAdress);
    }

    @Step
    public void typePassword(String password){
        registerPage.setPassword(password);
    }

    @Step
    public void typeConfPassword(String confPassword){
        registerPage.setConfPassword(confPassword);
    }

    @Step
    public void clickRegister() {
        registerPage.clickRegButton();
    }

























}
