package selenium;


import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.webdriver.OptionsWithArguments;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static java.lang.Thread.sleep;

public class GoogleTest {
    public static void main(String[] args) throws InterruptedException {
        SeleniumBase base = new SeleniumBase();
        ChromeDriver driver = base.seleniumInit("https://www.saucedemo.com/");
        WebElement user = driver.findElement(By.id("user-name"));
        user.click();
        user.sendKeys("standard_user");
        WebElement pw = driver.findElement(By.id("password"));
        pw.click();
        pw.sendKeys("secret_sauce");
        WebElement login  = driver.findElement(By.id("login-button"));
        login.click();
        sleep(3000);
        driver.close();
    }
}
