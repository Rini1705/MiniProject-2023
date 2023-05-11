package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.java.User;

public class UserSteps {
    @Steps
    User user = new User();

    @Given("I set GET api endpoints user")
    public void setGetApiEndpointsUser() {
        user.setGetApiEndpointUser();
    }

    @Given("I have valid token {string}")
    public void haveValidToken(String token) {
        user = new User(token);
    }

    @When("I send GET HTTP request user")
    public void sentGetHttpRequestUser() {
        user.sendGetHttpRequestUser();
    }

    @When("I send GET HTTP request user2")
    public void sendGetHttpRequestUser2() {
        user.sendGetHttpRequestUser2();
    }

    @Then("I receive valid HTTP response code 200 user")
    public void receiveValidHttp200User() {
        user.receiveValidHttp200User();
    }

    @Then("I receive valid HTTP response code 401 user")
    public void receiveValidHttp401User() {
        user.receiveValidHttp401User();
    }
}