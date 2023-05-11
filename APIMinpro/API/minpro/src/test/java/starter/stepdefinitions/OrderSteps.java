package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.java.Order;

public class OrderSteps {
    @Steps
    Order order = new Order();

    @Given("I set POST api endpoints order")
    public void setPostApiEndpointOrder() {
        order.setPostApiEndpointOrder();
    }

    @Given("I set GET api endpoints order")
    public void setGetApiEndpointOrder() {
        order.setGetApiEndpointOrder();
    }

    @When("I send POST HTTP request order")
    public void sentPostHttpRequestOrder() {
        order.sendPostHTTPRequestOrder();
    }
    @When("I send GET HTTP request order")
    public void sendGetHttpRequestOrder() {
        order.sendGetHttpRequestOrder();
    }
    @When("I send GET HTTP request order2")
    public void sendGetHttpRequestOrder2() {
        order.sendGetHttpRequestOrder2();
    }
    @Then("I receive valid HTTP response code 200 order")
    public void receiveValidHttp200Order() {
        order.receiveValidHttp200Order();
    }
    @Then("I receive valid HTTP response code 401 order")
    public void receiveValidHttp401Order() {
        order.receiveValidHttp401Order();
    }

}