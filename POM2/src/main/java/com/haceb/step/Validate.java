package com.haceb.step;

import com.haceb.models.NameProductModel;
import com.haceb.pageObject.PayDetailsCartPage;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

import static com.haceb.models.NameProductModel.getNameProduct;
import static org.junit.Assert.assertEquals;

public class Validate {
    @Page
    PayDetailsCartPage PayDetailsCartPage;

    @Step
    public void assertion(){
        String produc = getNameProduct();
        assertEquals(
               String.valueOf(produc),
                String.valueOf(PayDetailsCartPage.getDriver()
                        .findElement(PayDetailsCartPage.getLblProductName()).getText())
        );
    }
}
