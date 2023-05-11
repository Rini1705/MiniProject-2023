package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.java.Product;

public class ProductSteps {

    @Steps
    Product product;

    @Given("I set POST api endpoints product")
    public void setPostApiEndpointsProduct() {
        product.setPostApiEndpointProduct();
    }

    @Given("I set GET api endpoints product")
    public void setGetApiEndpointsProduct() {
        product.setGetApiEndpointProduct();
    }

    @Given("I set GET api endpoints product2")
    public void setGetApiEndpointsProduct2() {
        product.setGetApiEndpointProduct2();
    }

    @When("I send POST HTTP request product")
    public void sendPostHttpRequestProduct() {
        product.sendPostHttpRequestProduct();
    }

    @When("I send POST HTTP request product2")
    public void sendPostHttpRequestProduct2() {
        product.sendPostHttpRequestProduct2();
    }
    @When("I send POST HTTP request product3")
    public void sendPostHttpRequestProduct3() {
        product.sendPostHttpRequestProduct3();
    }
    @When("I send GET HTTP request product")
    public void sentGetHttpRequestProduct() {
        product.sendGetHttpRequestProduct();
    }
    @When("I send GET HTTP request product2")
    public void sendGetHttpRequestProduct2() {
        product.sendGetHttpRequestProduct2();
    }

    @Then("I receive valid HTTP response code 200 product")
    public void receiveValidHttp200Product() {
        product.receiveValidHttp200Product();
    }

    @Then("I receive valid HTTP response code 400 product")
    public void receiveValidHttp400Product() {
        product.receiveValidHttp400Product();
    }

    @Then("I receive valid HTTP response code 500 product")
    public void receiveValidHttp500Product() {
        product.receiveValidHttp500Product();
    }
}