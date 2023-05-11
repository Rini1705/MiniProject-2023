package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.java.Register;

public class RegisterSteps {

    @Steps
    Register register;

    @Given("I set POST api endpoints register")
    public void setPostApiEndpointsRegister() {
        register.setPostApiEndpointRegister();
    }

    @When("I send POST HTTP request register")
    public void sendPostHttpRequestRegister() {
        register.sendPostHttpRequestRegister();
    }

    @When("I send POST HTTP request register2")
    public void sendPostHttpRequestRegister2() {
        register.sendPostHttpRequestRegister2();
    }

    @When("I send POST HTTP request register3")
    public void sendPostHttpRequestRegister3() {
        register.sendPostHttpRequestRegister3();
    }

    @When("I send POST HTTP request register4")
    public void sendPostHttpRequest4() {
        register.sendPostHttpRequestRegister4();
    }

    @When("I send POST HTTP request register5")
    public void sendPostHttpRequest5() {
        register.sendPostHttpRequestRegister5();
    }


    @Then("I receive valid HTTP response code 200 register")
    public void receiveValidHttp200Register() {
        register.receiveValidHttp200Register();
    }

    @Then("I receive valid HTTP response code 400 register")
    public void receiveValidHttp400Register() {
        register.receiveValidHttp400Register();
    }
}

