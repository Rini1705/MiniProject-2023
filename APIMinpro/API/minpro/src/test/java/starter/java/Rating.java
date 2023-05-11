package starter.java;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

public class Rating {

    protected String url = "https://altashop-api.fly.dev/api/";

    @Step("I set POST api endpoints rating")
    public String setPostApiEndpointRating() {
        return url + "products/13500/ratings";
    }

    @Step("I set POST api endpoints rating2")
    public String setPostApiEndpointRating2() {
        return url + "products/13500/ratings";
    }

    @Step("I set GET api endpoints rating")
    public String setGetApiEndpointRating() {
        return url + "products/13500/ratings";
    }

    @Step("I send POST HTTP request rating")
    public void sendPostHTTPRequestRating() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("count", 5);

        SerenityRest.given()
                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkFkaXR5YSBOdWdyYWhhIiwiRW1haWwiOiJhZGl0QGdtYWlsLmNvbSJ9.VM2lARkmmliu1pWtk1uhb8z5fGaElvH1jIoYM72Te3g")
                .body(requestBody.toJSONString())
                .post(setPostApiEndpointRating())
                .then()
                .statusCode(200);
    }


    @Step("Then I receive valid HTTP response code 500 rating")
    public void receiveValidHttp500Rating() {
        restAssuredThat(response -> response.statusCode(500));
    }

    @Step("I send POST HTTP request rating")
    public void sendPostHttpRequestRating2() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("count", 10);

        SerenityRest.given()
                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkFkaXR5YSBOdWdyYWhhIiwiRW1haWwiOiJhZGl0QGdtYWlsLmNvbSJ9.VM2lARkmmliu1pWtk1uhb8z5fGaElvH1jIoYM72Te3g")
                .body(requestBody.toJSONString())
                .post(setPostApiEndpointRating2())
                .then()
                .statusCode(500);
    }

    @Step("I receive valid HTTP response code 200 rating")
    public void receiveValidHttp200Rating() {
        restAssuredThat(response -> response.statusCode(200));
    }
    @Step("I send GET HTTP request rating")
    public void sendGetHttpRequestRating() {
        SerenityRest.given().get(setGetApiEndpointRating());
    }

}
