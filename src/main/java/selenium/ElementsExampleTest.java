package selenium;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.awt.image.Kernel;
import java.util.List;

import static java.lang.Thread.sleep;

public class ElementsExampleTest {
    public static void main(String[] args) throws InterruptedException {

        SeleniumBase base = new SeleniumBase();
        ChromeDriver driver = base.seleniumInit("https://www.saucedemo.com/");
        WebElement user = driver.findElement(By.id("user-name"));
        WebElement pw = driver.findElement(By.id("password"));
        WebElement login = driver.findElement(By.id("login-button"));


        Thread.sleep(3000);
      Actions action = new Actions(driver);
        user.click();
        user.clear();
         user.sendKeys("standard_user");
         Thread.sleep(5000);
         user.sendKeys(Keys.ESCAPE);
      Thread.sleep(5000);

        pw.click();
        pw.clear();
        pw.sendKeys("secret_sauce");

        login.click();

        WebElement price = driver.findElement(By.className("inventory_item_price"));
        String priceOfIem= price.getText();
        System.out.println("The price of item is "+priceOfIem);

       List<WebElement> prices =  driver.findElements(By.className("inventory_item_price"));
       for (WebElement priceToAnalyze:prices ){
           String pattern = priceToAnalyze.getText();
           System.out.println("price found "+pattern);
driver.getCurrentUrl();
driver.navigate().forward();
       }
      action.keyDown(Keys.ALT).sendKeys(Keys.F4);

    }

}
