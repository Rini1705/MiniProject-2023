package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.java.Categories;

public class CategoriesSteps {

    @Steps
    Categories categories;

    @Given("I set POST api endpoints categories")
    public void setPostApiEndpointsf() {
        categories.setPostApiEndpointCategories();
    }

    @Given("I set GET api endpoints categories")
    public void setGetApiEndpoints() {
        categories.setGetApiEndpointCategories();
    }

    @When("I send POST HTTP request categories")
    public void sendPostHttpRequestCategories() {
        categories.sendPostHttpRequestCategories();
    }

    @When("I send POST HTTP request categories2")
    public void sendPostHttpRequestCategories2() {
        categories.sendPostHttpRequestCategories2();
    }

    @When("I send POST HTTP request categories3")
    public void sendPostHttpRequestCategories3() {
        categories.sendPostHttpRequestCategories3();
    }

    @When("I send GET HTTP request categories")
    public void sentGetHttpRequestCategories() {
        categories.sendGetHttpRequestCategories();
    }

    @When("I send GET HTTP request categories2")
    public void sendGetHttpRequestCategories2() {
        categories.sendGetHttpRequestCategories2();
    }

    @Then("I receive valid HTTP response code 200 categories")
    public void receiveValidHttp200Categories() {
        categories.receiveValidHttp200Categories();
    }

    @Then("I receive valid HTTP response code 500 categories")
    public void receiveValidHttp500Categories() {
        categories.receiveValidHttp500Categories();
    }
}