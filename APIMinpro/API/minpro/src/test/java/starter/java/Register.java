package starter.java;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.apache.commons.lang3.RandomStringUtils;
import org.json.simple.JSONObject;

public class Register {

    protected String url = "https://altashop-api.fly.dev/api/";

    @Step("I set POST api endpoints register")
    public String setPostApiEndpointRegister() {
        return url + "auth/register";
    }

    @Step("I send POST HTTP request register")
    public void sendPostHttpRequestRegister() {
        JSONObject requestBody = new JSONObject();

        String alphabet = "abcdfgh";
        String s = RandomStringUtils.random(10, alphabet);

        // GANTI SETIAP RUN
        requestBody.put("email", s);
        requestBody.put("password", s);
        requestBody.put("fullname", s);

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString())
                .post(setPostApiEndpointRegister());
    }

    @Step("I receive valid HTTP response code 200 register")
    public void receiveValidHttp200Register() {
        restAssuredThat(response -> response.statusCode(200));
    }

    ///NEGATIFFF
    @Step("I send POST HTTP request register2")
    public void sendPostHttpRequestRegister2() {
        JSONObject requestBody = new JSONObject();

        String alphabet = "abcdfgh";
        String t = RandomStringUtils.random(10, alphabet);
        requestBody.put("email", t);
        requestBody.put("password", t);
        requestBody.put("fullname", "");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString())
                .post(setPostApiEndpointRegister());
    }

    @Step("I receive valid HTTP response code 400 register")
    public void receiveValidHttp400Register() {
        restAssuredThat(response -> response.statusCode(400));
    }
    @Step("I send POST HTTP request register3")
    public void sendPostHttpRequestRegister3() {
        JSONObject requestBody = new JSONObject();
        String alphabet = "abcdfgh";
        String u = RandomStringUtils.random(10, alphabet);
        requestBody.put("email", "");
        requestBody.put("password", u);
        requestBody.put("fullname", u);

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString())
                .post(setPostApiEndpointRegister());
    }
    @Step("I send POST HTTP request register4")
    public void sendPostHttpRequestRegister4() {
        JSONObject requestBody = new JSONObject();

        String alphabet = "abcdfgh";
        String v = RandomStringUtils.random(10, alphabet);
        requestBody.put("email", v);
        requestBody.put("password", "");
        requestBody.put("fullname", v);

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString())
                .post(setPostApiEndpointRegister());
    }

    @Step("I send POST HTTP request register5")
    public void sendPostHttpRequestRegister5() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "rinike4@gmail.com");
        requestBody.put("password", "1234567");
        requestBody.put("fullname", "rinimaulidaaaa");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString())
                .post(setPostApiEndpointRegister());
    }
}