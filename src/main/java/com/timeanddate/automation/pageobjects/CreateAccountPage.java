package com.timeanddate.automation.pageobjects;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class CreateAccountPage extends PageObject {
    By espacioNombre = By.xpath("//*[@id='createform']/div[1]/div[2]/div[2]/input");
    By espacioEmail = By.xpath("//*[@id='createform']/div[1]/div[2]/div[3]/input");
    By espacioPassword = By.xpath("//*[@id='password']");
    By espacioConfirmPassword = By.xpath("//*[@id='password1']");
    By botonCreateNewAccount = By.xpath("//*[@id='create']");
    public By mensajeCuentaExistente = By.xpath("//*[@id=/'errormessage/']");
    //*[@id="errormessage"] //*[@class='alert error']"

    public void escribirNombre(String name){

        getDriver().findElement(espacioNombre).sendKeys(name);
    }
    public void escribirEmail(String email){

        getDriver().findElement(espacioEmail).sendKeys(email);
    }
    public void escribirPassword(String password){

        getDriver().findElement(espacioPassword).sendKeys(password);
    }
    public void escribirConfirmPassword(String password){

        getDriver().findElement(espacioConfirmPassword).sendKeys(password);
    }
    public void clickBotonCreateNewAccount(){

        getDriver().findElement(botonCreateNewAccount).click();
    }

}

