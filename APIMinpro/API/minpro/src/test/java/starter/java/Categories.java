package starter.java;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

public class Categories {

    protected String url = "https://altashop-api.fly.dev/api/";

    @Step("I set POST api endpoints categories")
    public String setPostApiEndpointCategories() {
        return url + "categories";
    }

    @Step("I set GET api endpoints categories")
    public String setGetApiEndpointCategories() {
        return url + "categories";
    }

    @Step("I send POST HTTP request categories")
    public void sendPostHttpRequestCategories() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("name", "Gaming");
        requestBody.put("description", "For gaming purposes");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString())
                .post(setPostApiEndpointCategories());
    }

    @Step("I receive valid HTTP response code 200 categories")
    public void receiveValidHttp200Categories() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I send POST HTTP request categories2")
    public void sendPostHttpRequestCategories2() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("name", "Gaming");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString())
                .post(setPostApiEndpointCategories());
    }

    @Step("I send POST HTTP request categories3")
    public void sendPostHttpRequestCategories3() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("description", "For gaming purposes");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString())
                .post(setPostApiEndpointCategories());
    }

    @Step("I receive valid HTTP response code 500 categories")
    public void receiveValidHttp500Categories() {
        restAssuredThat(response -> response.statusCode(500));
    }

    @Step("I send GET HTTP request categories")
    public void sendGetHttpRequestCategories() {
        SerenityRest.given().get(setGetApiEndpointCategories());
    }

    @Step("I send GET HTTP request categories2")
    public void sendGetHttpRequestCategories2() {
        SerenityRest.given().get(setGetApiEndpointCategories());
    }
}