package StepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class detail {
    WebDriver driver;

    @Given("I Openn browserrr")
    public void iOpennBrowserrr() {
        final String dir = System.getProperty("user.dir");
        System.out.println("current dir = " + dir);
        System.setProperty("webdriver.chrome.driver", dir + "/driver/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @When("Open websitee alta-shopp")
    public void openWebsiteeAltaShopp() throws InterruptedException {
        driver.get("https://alta-shop.vercel.app/");
        Thread.sleep(1000);
    }

    @And("I click detail in items product")
    public void iClickDetailInItemProduct() {
        driver.findElement(By.xpath("//div[5]//button[@class='button-beli v-btn v-btn--outlined theme--light v-size--small primary--text']")).click();
    }

    @Then("I can see detail product")
    public void iCanSeeDetailProduct() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[@class='v-card__text']")).isDisplayed();
        driver.close();
        driver.quit();
    }
}
