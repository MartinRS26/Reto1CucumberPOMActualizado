package com.timeanddate.automation.stepdefinitions;

import com.timeanddate.automation.models.Data;
import com.timeanddate.automation.pageobjects.HomePage;
import com.timeanddate.automation.pageobjects.LoginPage;
import com.timeanddate.automation.steps.CreateAccountStep;
import com.timeanddate.automation.steps.HomeStep;
import com.timeanddate.automation.steps.LoginStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

import java.util.List;

public class VerificacionStepDefinition {
    @Steps
    HomeStep homeStep;

    @Steps
    CreateAccountStep createAccountStep;
    @Steps
    LoginStep loginStep;

    @Given("^I enter the registration page$")
    public void iEnterTheRegistrationPage() throws InterruptedException {
        homeStep.openBrowser();
        homeStep.selectCreateAccount();
        Thread.sleep(3000);
    }
    @When("^input registration data$")
    public void inputRegistrationData(List<Data> dataList) throws InterruptedException {
        createAccountStep.createNewAccount(dataList.get(0));
        Thread.sleep(3000);
        createAccountStep.existingAccountMessage();


    }
    @Then("^the text of the welcome offer would be$")
    public void theTextOfTheWelcomeOfferWouldBe (List<Data> dataList) throws InterruptedException {

        loginStep.textoOfertaBienvenida(dataList.get(0));
        Thread.sleep(3000);

    }
}
