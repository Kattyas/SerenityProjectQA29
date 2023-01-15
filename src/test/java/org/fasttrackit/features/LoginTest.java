package org.fasttrackit.features;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.LoginSteps;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class LoginTest {

    @Managed(uniqueSession = true)
    public WebDriver driver;

    @Before
    public void maximiseBrowser(){
        driver.manage().window().maximize();
    }
    @Steps
    private LoginSteps loginSteps;



    @Test
    public void validLoginTest(){
        loginSteps.navigateToLoginPage();
        loginSteps.typeUserEmail("cosmin@fasttrackit.org");
        loginSteps.typePassword("123456");
        loginSteps.clickLogin();
        loginSteps.userIsLoggedIn("Cosmin Fast");
    }

}
