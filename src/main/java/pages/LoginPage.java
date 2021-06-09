package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.WebdriverUtils;

public class LoginPage {

    private static WebDriver driver;


    public LoginPage() {

        PageFactory.initElements(WebdriverUtils.getDriver(), this);
    }

    @FindBy(name = "username")
    public WebElement loginPage;
}
