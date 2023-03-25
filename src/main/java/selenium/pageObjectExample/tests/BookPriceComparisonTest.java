package selenium.pageObjectExample.tests;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import selenium.SeleniumBase;
import selenium.pageObjectExample.tests.AmazonPage;

public class BookPriceComparisonTest {
  WebDriver driver;
   AmazonPage amazonPage;

  @Before
  public void setup() {
   SeleniumBase base = new SeleniumBase();
   base.seleniumInit("https://www.amazon.com");
    amazonPage = new AmazonPage(driver);
  }

  @After
  public void teardown() {
    driver.close();
  }

  @Test
  public void testCompareBookPrices() {
    amazonPage.searchbook("harry potter ");

    amazonPage.getBookPrices();
    System.out.println(amazonPage);
    }
  }
