package selenium.pageObjectExample.tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import selenium.SeleniumBase;

import java.time.Duration;
import java.util.List;

public class ConditionalCommands {
  public static void main(String[] args) throws InterruptedException {

    SeleniumBase base = new SeleniumBase();
    ChromeDriver driver = base.seleniumInit("https://demo.guru99.com/test/radio.html");
Thread.sleep(5000);
    List<WebElement> allInputTypes = driver.findElements(By.tagName("a"));


    for (WebElement inputTypes: allInputTypes) {
      String printAll = inputTypes.getText();
      System.out.println(printAll);
      if (inputTypes.getText().equals("Telecom Project")) {
        Thread.sleep(10000);




      }
      inputTypes.click();
      inputTypes.sendKeys(Keys.ESCAPE);
      inputTypes.sendKeys(Keys.ESCAPE);



      }


    }


  }