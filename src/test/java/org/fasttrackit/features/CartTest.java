package org.fasttrackit.features;

import net.serenitybdd.junit.runners.SerenityRunner;
import org.junit.Test;
import org.junit.runner.RunWith;


@RunWith(SerenityRunner.class)
public class CartTest extends BaseTest{


    @Test
    public void addToCartTest(){
        loginSteps.doLogin("cosmin@fasttrackit.org","123456");

    }
}
