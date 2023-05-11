package starter.java;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

public class Order {

    protected String url = "https://altashop-api.fly.dev/api/";

    @Step("I set POST api endpoints order")
    public String setPostApiEndpointOrder() {
        return url + "orders";
    }

    @Step("I set GET api endpoints order")
    public String setGetApiEndpointOrder() {
        return url + "orders";
    }

    @Step("I send POST HTTP request order")
    public void sendPostHTTPRequestOrder() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("product_id", 13000);
        requestBody.put("quantity", 1);

        SerenityRest.given()
                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkFkaXR5YSBOdWdyYWhhIiwiRW1haWwiOiJhZGl0QGdtYWlsLmNvbSJ9.VM2lARkmmliu1pWtk1uhb8z5fGaElvH1jIoYM72Te3g")
                .get(setGetApiEndpointOrder())
                .then()
                .statusCode(200);
    }


    @Step("I receive valid HTTP response code 200 order")
    public void receiveValidHttp200Order() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I send GET HTTP request order")
    public void sendGetHttpRequestOrder() {
        SerenityRest.given()
                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkFkaXR5YSBOdWdyYWhhIiwiRW1haWwiOiJhZGl0QGdtYWlsLmNvbSJ9.VM2lARkmmliu1pWtk1uhb8z5fGaElvH1jIoYM72Te3g")
                .get(setGetApiEndpointOrder())
                .then()
                .statusCode(200);
    }

    @Step("I send GET HTTP request order2")
    public void sendGetHttpRequestOrder2() {
        SerenityRest.given().get(setGetApiEndpointOrder());
    }
    @Step("Then I receive valid HTTP response code 401 order")
    public void receiveValidHttp401Order() {
        restAssuredThat(response -> response.statusCode(401));
    }
}