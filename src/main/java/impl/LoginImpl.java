package impl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;
import utils.ConfigReader;
import utils.WebdriverUtils;

public class LoginImpl {

    private static WebDriver driver;

    LoginPage loginPage = new LoginPage();

    public void navigateToPage() {
        String url = ConfigReader.getProperty("url");
        WebdriverUtils.getDriver().get(url);
        
    }

    public void validateLoginPage() {
        driver.findElement(By.xpath("//div[@class='text']")).isDisplayed();
    }
}
