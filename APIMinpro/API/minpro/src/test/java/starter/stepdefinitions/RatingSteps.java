package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.java.Rating;

public class RatingSteps {
    @Steps
    Rating rating;

    @Given("I set POST api endpoints rating")
    public void setPostApiEndpointRating() {
        rating.setPostApiEndpointRating();
    }

    @Given("I set POST api endpoints rating2")
    public void setPostApiEndpointRating2() {
        rating.setPostApiEndpointRating2();
    }

    @Given("I set GET api endpoints rating")
    public void setGetApiEndpointRating() {
        rating.setGetApiEndpointRating();
    }

    @When("I send POST HTTP request rating")
    public void sentPostHttpRequestRating() {
        rating.sendPostHTTPRequestRating();
    }
    @When("I send POST HTTP request rating2")
    public void sendPostHttpRequestRating2() {
        rating.sendPostHttpRequestRating2();
    }
    @When("I send GET HTTP request rating")
    public void sendGetHttpRequestRating() {
        rating.sendGetHttpRequestRating();
    }
    @Then("I receive valid HTTP response code 200 rating")
    public void receiveValidHttp200Rating() {
        rating.receiveValidHttp200Rating();
    }
    @Then("I receive valid HTTP response code 500 rating")
    public void receiveValidHttp500Rating() {
        rating.receiveValidHttp500Rating();
    }
}