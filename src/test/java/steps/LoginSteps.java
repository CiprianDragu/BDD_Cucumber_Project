package steps;

import data.Constants;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import pages.HomePage;
import pages.LoginPage;
import pages.NewAccountPage;

public class LoginSteps {
    WebDriver driver;

    @Given("User navigate to Home page")
    public void userNavigateToHomePage() {
        driver = new ChromeDriver();
        driver.get(Constants.URL);
        driver.manage().window().maximize();
    }

    @When("User clicks sign in button")
    public void userClicksSignInButton() {
        HomePage homePage = new HomePage(driver);
        homePage.clickSignInButton();
    }

    @And("User inputs valid email and password")
    public void userInputsValidEmailAndPassword() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.inputEmail();
        loginPage.inputPassword();
        loginPage.clickSubmitButton();
    }

    @Then("Welcome message is displayed in home page")
    public void welcomeMessageIsDisplayedInHomePage() {
        HomePage homePage = new HomePage(driver);
        ;
        String expectedMessage = "Welcome";
        Assert.assertTrue(homePage.getWelcomeText().contains(expectedMessage));

    }

    @When("User clicks Create an Account")
    public void userClicksCreateAnAccount() {
        HomePage homePage = new HomePage(driver);
        homePage.clickCreateNewAccountButton();

    }

    @And("User create new Account")
    public void userCreateNewAccount() {
        NewAccountPage newAccountPage = new NewAccountPage(driver);
        newAccountPage.inputFirsName();
        newAccountPage.inputLastName();
        newAccountPage.inputEmail();
        newAccountPage.inputPassword();
        newAccountPage.inputConfirmPassword();
        newAccountPage.clickSubmitButton();

    }

    @Then("Welcome message its displayed")
    public void welcomeMessageItsDisplayed() {
        NewAccountPage newAccountPage = new NewAccountPage(driver);
        String expectedMessage = "Welcome";
        Assert.assertTrue(newAccountPage.getWelcomeText().contains(expectedMessage));
    }
}
