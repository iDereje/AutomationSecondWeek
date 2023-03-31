package selenium.pageObjectExample.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import selenium.SeleniumBase;

import java.time.Duration;
import java.util.List;

public class ExplicitWait {
  public static void main(String[] args) throws InterruptedException {


  SeleniumBase base = new SeleniumBase();
  ChromeDriver driver = base.seleniumInit("https://google.com/ncr");
  driver.findElement(By.name("q")).sendKeys("cheese" +Keys.ENTER);

    Thread sleep = new Thread();
    sleep.sleep(5000);
    sleep.sleep(5000);
    sleep.sleep(5000);
    sleep.sleep(5000);
    sleep.sleep(5000);
    sleep.sleep(5000);


  // Initialize and wait till element(link) became clickable - timeout in 10 seconds
  WebElement firstResult = new WebDriverWait(driver, Duration.ofSeconds(10))
          .until(ExpectedConditions.elementToBeClickable(By.xpath("//a/h3")));
// Print the first result
System.out.println(firstResult.getText());
base.seleniumClose(driver);
}

}