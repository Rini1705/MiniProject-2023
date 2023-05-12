package StepDef;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class register {

    WebDriver driver;
    @Given("I Open browserr")
    public void iOpenBrowserr() {
        final String dir = System.getProperty("user.dir");
        System.out.println("current dir = " + dir);
        System.setProperty("webdriver.chrome.driver", dir + "/driver/chromedriver.exe");
        driver = new ChromeDriver();
    }
    @When("Open website alta-shopp")
    public void openWebsiteAltaShopp() throws InterruptedException {
        driver.get("https://alta-shop.vercel.app/auth/register");
        Thread.sleep(1000);
    }
    @When("user input valid name")
    public void userInputValidName() {
        driver.findElement(By.xpath("//form[@class='v-form']/div[1]//input[1]")).sendKeys("Alterra");
    }

    @And("user input valid email")
    public void userInputValidEmail() {
        driver.findElement(By.xpath("//form[@class='v-form']/div[2]//input[1]")).sendKeys("alterra123@gmail.com");
    }

    @And("user input valid password")
    public void userInputValidPassword() {
        driver.findElement(By.xpath("//div[3]//input[1]")).sendKeys("121212");
    }

    @And("user click register button")
    public void userClickRegisterButton() {
        driver.findElement(By.xpath("//span[normalize-space()='Register']")).click();
    }

    @Then("user success to create account and redirect to login")
    public void userSuccessToCreateAccount() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[@class='v-card__title']")).isDisplayed();
        driver.close();
        driver.quit();
    }

    @When("user input empty fields name")
    public void userInputEmptyFiledsName() {
        driver.findElement(By.xpath("//form[@class='v-form']/div[1]//input[1]")).sendKeys("");
    }

    @And("user input empty fields email")
    public void userInputEmptyFieldsEmail() {
        driver.findElement(By.xpath("//form[@class='v-form']/div[2]//input[1]")).sendKeys("");
    }

    @And("user input empty fields password")
    public void userInputEmptyFieldsPassword() {
        driver.findElement(By.xpath("//div[3]//input[1]")).sendKeys("");

    }

    @And("user click register button2")
    public void userClickRegisterButton2() {
        driver.findElement(By.xpath("//span[normalize-space()='Register']")).click();
    }

    @Then("user fail to create account and redirect to login")
    public void userSeeErrorMessageRecordNotFound() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[@class='v-alert__wrapper']")).isDisplayed();
        driver.close();
        driver.quit();
    }

}
