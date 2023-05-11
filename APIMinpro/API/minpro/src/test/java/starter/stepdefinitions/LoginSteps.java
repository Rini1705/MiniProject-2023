package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.java.Login;

public class LoginSteps {

    @Steps
    Login login;

    // Login
    //// Positive

    @Given("I set POST api endpoints login")
    public void setPostApiEndpointsLogin() {
        login.setPostApiEndpointLogin();
    }

    @When("I send POST HTTP request login")
    public void sendPostHttpRequestLogin() {
        login.sendPostHttpRequestLogin();
    }

    @When("I send POST HTTP request login2")
    public void sendPostHttpRequestLogin2() {
        login.sendPostHttpRequestLogin2();
    }

    @When("I send POST HTTP request login3")
    public void sendPostHttpRequestLogin3() {
        login.sendPostHttpRequestLogin3();
    }

    @When("I send POST HTTP request login4")
    public void sendPostHttpRequestLogin4() {
        login.sendPostHttpRequestLogin4();
    }

    @When("I send POST HTTP request login5")
    public void sendPostHttpRequestLogin5() {
        login.sendPostHttpRequestLogin5();
    }

    @Then("I receive valid HTTP response code 200 login")
    public void receiveValidHttp200Login() {
        login.receiveValidHttp200Login();
    }

    @Then("I receive valid HTTP response code 400 login")
    public void receiveValidHttp400Login() {
        login.receiveValidHttp400Login();
    }
}
