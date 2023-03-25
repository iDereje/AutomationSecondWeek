package selenium.pageObjectExample.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import selenium.SeleniumBase;

import java.util.List;

public class PrintButtonTextTest {
  public static void main(String[] args) {
    SeleniumBase base = new SeleniumBase();
    ChromeDriver driver = base.seleniumInit("https://demo.guru99.com/test/flash-testing.html");
List <WebElement> buttonName = driver.findElements(By.xpath("1"));
      for (WebElement button: buttonName) {
        String printButton = button.getText();
        System.out.println(printButton);


      }

    }

    }



