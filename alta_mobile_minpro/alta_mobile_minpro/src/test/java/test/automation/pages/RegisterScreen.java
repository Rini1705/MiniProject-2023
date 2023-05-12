package test.automation.pages;

import io.appium.java_client.MobileBy;
import net.thucydides.core.annotations.Step;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import test.automation.pageobject.BasePageObject;
import com.github.javafaker.Faker;

public class RegisterScreen extends BasePageObject {
    
    By textRegister(){ 
        return MobileBy.xpath("//android.widget.Button[@content-desc=\"Register\"]");
    }

    By fieldFullName(){ 
        return MobileBy.xpath("//android.view.View/android.widget.EditText[1]");
    }

    By fieldEmail(){ 
        return MobileBy.xpath("//android.view.View/android.widget.EditText[2]");
    }

    By fieldPassword() { 
        return MobileBy.xpath("//android.view.View/android.widget.EditText[3]");
    }

    By buttonRegister() { 
        return MobileBy.xpath("//android.widget.Button[@content-desc=\"Register\"]");
    }

    By fieldAlertEmail(){ 
        return MobileBy.xpath("//android.view.View[@content-desc=\"email can not empty\"]");
    }

    By fieldAlertPassword(){ 
        return MobileBy.xpath("//android.view.View[@content-desc=\"password can not empty\"]");
    }
    
    By buttonAlert(){ 
        return MobileBy.xpath("//android.view.View[@content-desc=\"Gagal :(\"]");
    }

    public void clickTextRegister(){ 
        click(textRegister());
    }

    public void inputFieldFullName(String fullname) {
        click(fieldFullName());
        clear(fieldFullName());
        sendKeys(fieldFullName(),fullname);
    }

    public void inputEmail(String email){
        click(fieldEmail());
        clear(fieldEmail());
        sendKeys(fieldEmail(),email);
    }

    public void inputPassword(String password){
        click(fieldPassword());
        clear(fieldPassword());
        sendKeys(fieldPassword(),password);
    }

    public void clickButtonRegister(){ 
        click(buttonRegister());
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
}
