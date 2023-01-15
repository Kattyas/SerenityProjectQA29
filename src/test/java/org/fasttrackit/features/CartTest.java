package org.fasttrackit.features;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.CartSteps;
import org.fasttrackit.steps.LoginSteps;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class CartTest {

    @Managed(uniqueSession = true)
    private WebDriver driver;

    @Before
    public void maximiseBrowser(){
        driver.manage().window().maximize();
    }

    @Steps
    private LoginSteps loginSteps;
    @Steps
    private CartSteps cartSteps;


    @Test
    public void addToCartTest(){
        loginSteps.doLogin("cosmin@fasttrackit.org","123456");

    }
}
