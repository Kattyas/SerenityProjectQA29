package org.fasttrackit.features;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class AddNewAdressTest {

    @Managed(uniqueSession = true)
    private WebDriver driver;


    @Before
    public void maximiseBrowser(){
        driver.manage().window().maximize();
    }

















}
