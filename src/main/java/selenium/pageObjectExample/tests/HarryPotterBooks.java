package selenium.pageObjectExample.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import selenium.SeleniumBase;

import java.time.Duration;
import java.util.List;

public class HarryPotterBooks {
  public static void main(String[] args) {
    SeleniumBase base = new SeleniumBase();
    ChromeDriver driver = base.seleniumInit("https://www.amazon.com");
    WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
    searchBox.click();
    searchBox.sendKeys("harry potter");
    searchBox.sendKeys(Keys.ENTER);

    // Set implicit wait to 10 seconds
//    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//
//    List<WebElement> productCards = driver.findElements(By.cssSelector(".s-result-item"));
//
//    // Loop through the first 5 product cards and print their name and price
//    for (int i = 0; i < 5 && i < productCards.size(); i++) {
//      WebElement card = productCards.get(i);
//
//      // Find the name and price elements within the card
//      WebElement nameElement = card.findElement(By.cssSelector(".a-size-medium"));
//      WebElement priceElement = card.findElement(By.cssSelector(".a-price .a-offscreen"));
//
//      // Get the text values of the name and price elements
//      String name = nameElement.getText();
//      String price = priceElement.getText();
//
//      // Print the name and price
//      System.out.println(name + " - " + price);
//    }
//
//    // Close the browser
//    base.seleniumClose(driver);
//  }
}}
