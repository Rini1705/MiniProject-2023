package StepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class buy {

    WebDriver driver;
    @Given("I Opennn browserrr")
    public void iOpennnBrowserrr() {
        final String dir = System.getProperty("user.dir");
        System.out.println("current dir = " + dir);
        System.setProperty("webdriver.chrome.driver", dir + "/driver/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @When("Openn websitee alta-shopp")
    public void opennWebsiteeAltaShopp() throws InterruptedException {
        driver.get("https://alta-shop.vercel.app/");
        Thread.sleep(1000);
    }

    @And("I click beli in items product")
    public void iClickBeliInItemProduct() {
        driver.findElement(By.xpath("//div[5]//button[@class='button-beli ml-3 v-btn v-btn--outlined theme--light v-size--small primary--text']")).click();
    }

    @And("I can see keranjang to buy product")
    public void iCanSeeKeranjangToBuyProduct()  {
        driver.findElement(By.xpath("//i[@class='v-icon notranslate fas fa-shopping-cart theme--dark']")).click();
    }

    @Then("I can bayar product")
    public void iCanBayarProduct() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@id='button-bayar']")).click();
        driver.close();
        driver.quit();
    }
}

