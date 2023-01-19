package org.fasttrackit.features;

import net.serenitybdd.junit.runners.SerenityRunner;

import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)
public class RegisterTest extends BaseTest{

    @Test
    public void accountRegisterTest(){
        registerSteps.navigateToRegisterPage();
        registerSteps.typeFirstName("Kata");
        registerSteps.typeLastName("Katty");
        registerSteps.typeEmailField("A@yahoo.com");
        registerSteps.typePassword("1234567890");
        registerSteps.typeConfPassword("1234567890");
        registerSteps.clickRegister();
    }








}
