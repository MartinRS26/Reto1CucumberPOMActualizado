package com.timeanddate.automation.steps;

import com.timeanddate.automation.models.Data;
import com.timeanddate.automation.pageobjects.CreateAccountPage;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CreateAccountStep {
    CreateAccountPage createAccountPage = new CreateAccountPage();

    @Step
    public void createNewAccount(Data data){
        createAccountPage.escribirNombre(data.getName());
        createAccountPage.escribirEmail(data.getEmail());
        createAccountPage.escribirPassword(data.getPassword());
        createAccountPage.escribirConfirmPassword(data.getPassword());
        createAccountPage.clickBotonCreateNewAccount();
    }

    @Step
    public void existingAccountMessage(){
        createAccountPage.waitForCondition().until(ExpectedConditions.invisibilityOfElementLocated(createAccountPage.mensajeCuentaExistente));

    }
}
