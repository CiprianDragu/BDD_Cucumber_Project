package pages;

import data.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.Utils;

public class NewAccountPage extends BasePage {
    @FindBy(css = "#firstname")
    WebElement firstNameField;
    @FindBy(css = "#lastname")
    WebElement lastNameField;
    @FindBy(css = "#email_address")
    WebElement emailField;
    @FindBy(xpath = "//input[@id='password']")
    WebElement passwordField;
    @FindBy(xpath = "//input[@id='password-confirmation']")
    WebElement confirmPasswordField;
    @FindBy(xpath = "(//span[contains(text(),'Create an Account')])[1]")
    WebElement submitButton;
    @FindBy(xpath = "(//span[contains(text(),'Welcome')])[1]")
    WebElement welcomeMessage;
    public NewAccountPage(WebDriver driver) {
        super(driver);
    }
    public void inputFirsName() {
        firstNameField.sendKeys(Constants.FIRS_NAME);
    }
    public void inputLastName() {
        lastNameField.sendKeys(Constants.LAST_NAME);
    }
    public void inputEmail() {
        emailField.sendKeys(Constants.generateNewEmail());
    }
    public void  inputPassword() {
        passwordField.sendKeys(Constants.PASSWORD);
    }
    public void inputConfirmPassword() {
        confirmPasswordField.sendKeys(Constants.CONFIRM_PASSWORD);
    }
    public void clickSubmitButton() {
        submitButton.click();
    }
    public String getWelcomeText() {
        Utils.waitForElementToBeVisible(driver,welcomeMessage);
        return welcomeMessage.getText();
    }
}
