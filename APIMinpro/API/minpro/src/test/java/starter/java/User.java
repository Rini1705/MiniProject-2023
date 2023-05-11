package starter.java;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class User {

    protected String url = "https://altashop-api.fly.dev/api/";
    protected String token;

    public User() {
    }

    public User(String token) {
        this.token = token;
    }

    @Step("I set GET api endpoints user")
    public String setGetApiEndpointUser() {
        return url + "auth/info";
    }

    @Step("I send GET HTTP request user")
    public void sendGetHttpRequestUser() {
        SerenityRest.given()
                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkFkaXR5YSBOdWdyYWhhIiwiRW1haWwiOiJhZGl0QGdtYWlsLmNvbSJ9.VM2lARkmmliu1pWtk1uhb8z5fGaElvH1jIoYM72Te3g")
                .get(setGetApiEndpointUser())
                .then()
                .statusCode(200);

    }

    @Step("I receive valid HTTP response code 200 user")
    public void receiveValidHttp200User() {
        restAssuredThat(response -> response.statusCode(200));
    }


    ///NEGATIFFF
    @Step("I send GET HTTP request user2")
    public void sendGetHttpRequestUser2() {
        SerenityRest.given().get(setGetApiEndpointUser());
    }

    @Step("I receive valid HTTP response code 401 user")
    public void receiveValidHttp401User() {
        restAssuredThat(response -> response.statusCode(401));
    }
}