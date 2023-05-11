package starter.java;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class Product {

    protected String url = "https://altashop-api.fly.dev/api/";


    @Step("I set POST api endpoints product")
    public String setPostApiEndpointProduct() {
        return url + "products";
    }

    @Step("I set GET api endpoints product")
    public String setGetApiEndpointProduct() {
        return url + "products";
    }

    @Step("I set GET api endpoints product2")
    public String setGetApiEndpointProduct2() {
        return url + "products/13500";
    }

    @Step("I send POST HTTP request product")
    public void sendPostHttpRequestProduct() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("name", "XBOX1");
        requestBody.put("price", 499);
        JSONArray categoriesArray = new JSONArray();
        categoriesArray.add(12541);
        requestBody.put("categories", categoriesArray);

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString())
                .post(setPostApiEndpointProduct());
    }

    @Step("I receive valid HTTP response code 200 product")
    public void receiveValidHttp200Product() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I send POST HTTP request product2")
    public void sendPostHttpRequestProduct2() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("name", "");
        requestBody.put("price", 499);
        JSONArray categoriesArray = new JSONArray();
        categoriesArray.add(12541);
        requestBody.put("categories", categoriesArray);

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString())
                .post(setPostApiEndpointProduct());
    }

    @Step("I receive valid HTTP response code 500 product")
    public void receiveValidHttp500Product() {
        restAssuredThat(response -> response.statusCode(500));
    }

    @Step("I send POST HTTP request product3")
    public void sendPostHttpRequestProduct3() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("name", "XBOX1");
        requestBody.put("price", "");
        JSONArray categoriesArray = new JSONArray();
        categoriesArray.add(12541);
        requestBody.put("categories", categoriesArray);

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString())
                .post(setPostApiEndpointProduct());
    }

    @Step("I receive valid HTTP response code 400 product")
    public void receiveValidHttp400Product() {
        restAssuredThat(response -> response.statusCode(400));
    }

    @Step("I send GET HTTP request product")
    public void sendGetHttpRequestProduct() {
        SerenityRest.given().get(setGetApiEndpointProduct());
    }

    @Step("I send GET HTTP request product2")
    public void sendGetHttpRequestProduct2() {
        SerenityRest.given().get(setGetApiEndpointProduct2());
    }
}