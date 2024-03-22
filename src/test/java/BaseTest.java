import data.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import pages.BasePage;

public class BaseTest {

    WebDriver driver;

    @BeforeTest
    public void setUP() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(Constants.URL);
    }

    @AfterTest
    public void closeBrowser() {
        BasePage basePage = new BasePage(driver);
        basePage.waitInSeconds(3);
        driver.close();
    }
}
