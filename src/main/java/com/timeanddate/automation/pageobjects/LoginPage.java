package com.timeanddate.automation.pageobjects;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class LoginPage extends PageObject {
    public By textoOferta = By.xpath("//*[@id='mpo']/div/div/div/div[2]/p[1]");
    //*[@id="mpo"]/div/div/div/div/h2 //*[@id="mpo"]/div/div/div/div[2]/p[1]
    public String validarTextoOferta() {
        return getDriver().findElement(textoOferta).getText();
    }

}
