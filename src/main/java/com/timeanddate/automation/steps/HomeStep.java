package com.timeanddate.automation.steps;

import com.timeanddate.automation.pageobjects.HomePage;
import net.thucydides.core.annotations.Step;

public class HomeStep {
    HomePage homePage = new HomePage();

    @Step
    public void openBrowser(){
        homePage.open();
    }
    @Step
    public void selectCreateAccount(){
        homePage.clickBotonUsuario();
        homePage.clickBotonCreateAccount();
    }
}
