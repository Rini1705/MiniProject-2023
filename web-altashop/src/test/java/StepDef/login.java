package StepDef;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class login {
    WebDriver driver;

    @Given("I Open browser")
    public void iOpenBrowser() {
        final String dir = System.getProperty("user.dir");
        System.out.println("current dir = " + dir);
        System.setProperty("webdriver.chrome.driver", dir + "/driver/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @When("Open website alta-shop")
    public void openWebsiteAltaShop() throws InterruptedException {
        driver.get("https://alta-shop.vercel.app/auth/login");
        Thread.sleep(1000);
    }

    @And("I Enter a valid email and password")
    public void iEnterAValidEmailAndPassword() {
        driver.findElement(By.xpath("//form[@class='v-form']/div[1]//input[1]")).sendKeys("rini17@gmail.com");
        driver.findElement(By.xpath("//form[@class='v-form']/div[2]//input[1]")).sendKeys("1717");
    }

    @And("I click login button")
    public void iClickLoginButton() {
        driver.findElement(By.xpath("//span[.='Login']")).click();
    }

    @Then("I am on the home page")
    public void iAmOnTheHomePage() throws InterruptedException {
        Thread.sleep(3000);

        driver.findElement(By.xpath("//div[@class='v-input__slot']")).isDisplayed();
        driver.close();
        driver.quit();
    }

    @And("I Enter a invalid email and password")
    public void iEnterAInvalidEmailAndPassword() {
        driver.findElement(By.xpath("//form[@class='v-form']/div[1]//input[1]")).sendKeys("someone@@@mail.com");
        driver.findElement(By.xpath("//form[@class='v-form']/div[2]//input[1]")).sendKeys("123123!paswordsalah");
    }

    @And("I click login buttonn")
    public void iClickLoginButtonn() {
        driver.findElement(By.xpath("//span[.='Login']")).click();
    }

    @Then("User see error message record not found")
    public void userSeeErrorMessageRecordNotFound() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[@class='v-alert__content']")).isDisplayed();
        driver.close();
        driver.quit();
    }
}
