package selenium.pageObjectExample.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import selenium.SeleniumBase;

import java.time.Duration;
import java.util.List;

public class FindElementsBy2 {
  public static void main(String[] args) {



    SeleniumBase base = new SeleniumBase();
    ChromeDriver driver = base.seleniumInit("https://demo.guru99.com/test/newtours/");

    List<WebElement> ankerList = driver.findElements(By.tagName("a"));

    for (WebElement anker : ankerList) {

      String ankerListPtint = anker.getText();

      System.out.println(ankerListPtint);

    }



base.seleniumClose(driver);
  }}


