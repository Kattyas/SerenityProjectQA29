package org.fasttrackit.features;
import org.junit.Test;

public class LoginTest extends BaseTest{

    @Test
    public void validLoginTest(){
        loginSteps.navigateToLoginPage();
        loginSteps.typeUserEmail("cosmin@fasttrackit.org");
        loginSteps.typePassword("123456");
        loginSteps.clickLogin();
        loginSteps.userIsLoggedIn("Cosmin Fast");
    }

}
