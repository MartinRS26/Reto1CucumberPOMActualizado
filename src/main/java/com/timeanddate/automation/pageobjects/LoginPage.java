package com.timeanddate.automation.pageobjects;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class LoginPage extends PageObject {
    public By textoOferta = By.xpath("//*[@class='modal-body']/p[@class='mgt15']");
    public String validarTextoOferta() {
        return getDriver().findElement(textoOferta).getText();
    }

}
