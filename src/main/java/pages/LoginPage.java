package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage  extends BasePage{
    @FindBy(css = "#email")
    WebElement emailField;
    @FindBy(css = "#send2")
    WebElement submitButton;
    @FindBy(xpath = "(//input[@id='pass'])[1]")
    WebElement passwordField;
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void inputEmail() {
        emailField.sendKeys("john.smith@db.com");
    }
    public void inputPassword() {
        passwordField.sendKeys("Qwerty123*");
    }
    public void  clickSubmitButton() {
        submitButton.click();
    }
}
