package test.automation.stepdefinitions;

import io.cucumber.java.en.And;
import test.automation.pages.LoginScreen;

public class LogoutSteps {
    
    LoginScreen loginScreen = new LoginScreen();

    @And("I click button sign out")
    public void iClickButtonSignOut() {
        loginScreen.clickButtonSignin();
    }
}
