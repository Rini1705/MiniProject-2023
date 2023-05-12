package test.automation.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import test.automation.pages.RegisterScreen;
import test.automation.pages.LoginScreen;

public class RegisterSteps {
    
    LoginScreen loginScreen = new LoginScreen();
    RegisterScreen registerScreen = new RegisterScreen();

    @And("I click text register")
    public void iClickTextRegister() {
        registerScreen.clickTextRegister();
    }

    @And("I input field fullname")
    public void iInputFieldFullname() {
        registerScreen.inputFieldFullName("Rini5");
    }

    @And("I input field email")
    public void iInputFieldEmail() {
        registerScreen.inputEmail("Rini5@mail.com");
    }

    @And("I input field password")
    public void iInputFieldPassword() {
        registerScreen.inputPassword("123123");
    }

    @And("I click register button")
    public void iClickRegisterButton() {
        registerScreen.clickButtonRegister();
    }

    @Then("I get result message in register")
    public void iGet() {
        registerScreen.verifyAlertButton();
                    
    }
}
