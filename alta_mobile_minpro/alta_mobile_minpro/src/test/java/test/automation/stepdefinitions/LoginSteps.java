package test.automation.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import test.automation.pages.LoginScreen;


public class LoginSteps {
    
    LoginScreen loginScreen = new LoginScreen();

    @Given("I am on the product list")
    public void iAmOnTheProductList() {
        loginScreen.isDisplayedHeaderProduct();
    }

    @When("I click button sign in")
    public void iClickButtonSignin() {
        loginScreen.clickButtonSignin();
    }

    @And("I input field email in login")
    public void iInputFieldEmailInLogin() throws InterruptedException {
        String email = "testsatu" + "@mail.com";
        loginScreen.inputFieldEmail(email);
    }

    @And("I input field password in login")
    public void iInputFieldPasswordInLogin() {
        String password = "123123";
        loginScreen.inputFieldPassword(password);
    }

    @And("I click button login")
    public void iClickButtonLogin() {
        loginScreen.clickButtonLogin();
    }

    @Then("I get result the message")
    public void iGetThe() {
        loginScreen.verifyHeaderProduct();
                  
    }
}