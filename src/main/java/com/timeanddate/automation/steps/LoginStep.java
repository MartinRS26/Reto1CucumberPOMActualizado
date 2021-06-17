package com.timeanddate.automation.steps;

import com.timeanddate.automation.models.Data;
import com.timeanddate.automation.pageobjects.LoginPage;
import net.thucydides.core.annotations.Step;
import org.junit.jupiter.api.Assertions;

public class LoginStep {
    String textoBienvenida = "What's in the Newsletter?";
    LoginPage loginPage = new LoginPage();

    @Step
    public void textoOfertaBienvenida(){
        Assertions.assertEquals(textoBienvenida,loginPage.validarTextoOferta());
    }
}
