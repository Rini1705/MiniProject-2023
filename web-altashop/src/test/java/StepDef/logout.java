package StepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class logout {

    WebDriver driver;
    @Given("i open browser - logout")
    public void iOpenBrowserLogout() {
        final String dir = System.getProperty("user.dir");
        System.out.println("current dir = " + dir);
        System.setProperty("webdriver.chrome.driver", dir+"/driver/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @And("i am on the home page - logout")
    public void iAmOnTheHomePageLogout() throws InterruptedException {
        driver.get("https://alta-shop.vercel.app/auth/login");
        Thread.sleep(1000);
    }

    @When("i input valid email - logout")
    public void iInputValidEmailLogout() {
        driver.findElement(By.xpath("//form[@class='v-form']/div[1]//input[1]")).sendKeys("oke@gmail.com");
    }

    @And("i input valid password - logout")
    public void iInputValidPasswordLogout() {
        driver.findElement(By.xpath("//form[@class='v-form']/div[2]//input[1]")).sendKeys("1234");
    }

    @And("i click login button - logout")
    public void iClickLoginButtonLogout() {
        driver.findElement(By.xpath("//span[.='Login']")).click();
    }

    @When("i click account menu")
    public void iClickAccountMenu() throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(By.xpath("//div[@class='v-toolbar__content']/button[2]/span[@class='v-btn__content']")).click();
    }

    @And("i click Logout")
    public void iClickLogout() {
        driver.findElement(By.xpath("//div[@class='v-list v-sheet theme--light']/div[contains(.,'Logout')]")).click();
    }

    @Then("user successfull logout and redirect to login page")
    public void userSuccessfullLogoutAndRedirectToLoginPage() {
        driver.findElement(By.xpath("//div[@class='v-card__title']")).isDisplayed();
        driver.close();
        driver.quit();
    }
}

