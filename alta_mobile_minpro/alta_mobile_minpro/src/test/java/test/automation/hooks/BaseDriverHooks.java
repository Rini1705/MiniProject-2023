package test.automation.hooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import test.automation.driver.AndroidDriverPool;
import test.automation.driver.DriverPool;

import java.util.Optional;

public class BaseDriverHooks {
    
    @Before
    public void before(){
        AndroidDriverPool.initialize();
    }

    @After
    public void afterDriver(Scenario scenario) {
        if (scenario.isFailed()){
            TakesScreenshot screenshot = AndroidDriverPool.driver;
            byte[] imageByte = screenshot.getScreenshotAs(OutputType.BYTES);
            scenario.attach(imageByte, "image/png", scenario.getId());
        }
        AndroidDriverPool.quit();
    }
}
