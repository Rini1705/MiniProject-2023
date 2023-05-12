package test.automation.pages;

import io.appium.java_client.MobileBy;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import test.automation.pageobject.BasePageObject;

public class LoginScreen extends BasePageObject {
    By buttonSignin(){ 
        return MobileBy.xpath("//android.view.View[1]/android.widget.Button");
    }

    By fieldEmail(){ 
        return MobileBy.xpath("//android.view.View/android.widget.EditText[1]");
    }

    By fieldPassword() { 
        return MobileBy.xpath("//android.view.View/android.widget.EditText[2]");
    }

    By buttonLogin(){ 
        return MobileBy.xpath("//android.widget.Button[@content-desc=\"Login\"]");
    }

    By fieldAlertEmail(){ 
        return MobileBy.xpath("//android.view.View[@content-desc=\"email can not empty\"]");
    }

    By fieldAlertPassword(){ 
        return MobileBy.xpath("//android.view.View[@content-desc=\"password can not empty\"]");
    }

    By buttonAlert(){ 
        return MobileBy.xpath("//android.view.View[@content-desc=\"Email atau password tidak valid.\"]");
    }

    By headerProducts() { 
        return MobileBy.xpath("//android.view.View[@content-desc=\"Products\"]");
    }

    public void clickButtonSignin(){
        click(buttonSignin());
    }

    public void inputFieldEmail(String email) {
        click(fieldEmail());
        sendKeys(fieldEmail(),email);
    }

    public void inputFieldPassword(String password){
        click(fieldPassword());
        sendKeys(fieldPassword(),password);
    }

    public void clickButtonLogin(){ 
        click(buttonLogin());
    }

    public void isDisplayedHeaderProduct() { 
        isDisplayed(headerProducts());
    }

    public void verifyAlertEmail(){ 
        Assertions.assertTrue(find(fieldAlertEmail()).isDisplayed());
    }

    public void verifyAlertPassword(){ 
        Assertions.assertTrue(find(fieldAlertPassword()).isDisplayed());

    }

    public void verifyAlertButton() { 
        Assertions.assertTrue(find(buttonAlert()).isDisplayed());
    }

    public void verifyHeaderProduct(){
        Assertions.assertTrue(find(headerProducts()).isDisplayed());
    
    }
}

