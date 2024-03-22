package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.Utils;

public class HomePage extends BasePage {
    @FindBy(xpath = "(//a[contains(text(),'Sign In ')])[1]")
    WebElement signInButton;
    @FindBy(xpath = "(//span[contains(text(),'Welcome')])[1]")
    WebElement welcomeMessage;
    @FindBy(xpath = "(//a[contains(text(),'Create')])[1]")
    WebElement newAccountButton;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void clickSignInButton() {
        signInButton.click();
    }

    public String getWelcomeText() {
        Utils.waitForElementToBeVisible(driver, welcomeMessage);
        return welcomeMessage.getText();
    }

    public void clickCreateNewAccountButton() {
        newAccountButton.click();
    }
}
