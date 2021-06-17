package com.timeanddate.automation.pageobjects;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.timeanddate.com/")
public class HomePage extends PageObject {
    By botonUsuario = By.xpath("//div/a[@href='/custom/']");
    By botonCreateAccount = By.xpath("//p/a[contains(@class,'button blue large')]");

    public void clickBotonUsuario(){
        getDriver().findElement(botonUsuario).click();
    }
    public void clickBotonCreateAccount(){
        getDriver().findElement(botonCreateAccount).click();
    }

}
