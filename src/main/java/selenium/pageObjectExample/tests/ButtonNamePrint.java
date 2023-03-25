package selenium.pageObjectExample.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import selenium.SeleniumBase;

import java.time.Duration;
import java.util.List;

public class ButtonNamePrint {
  public static void main(String[] args) {
    SeleniumBase base = new SeleniumBase();
    ChromeDriver driver = base.seleniumInit("https://www.asos.com");
    WebElement searchProducts = driver.findElement(By.name("q"));
    searchProducts.click();
    searchProducts.sendKeys("Nike Shoes");
    searchProducts.sendKeys(Keys.ENTER);

    // Set implicit wait to 10 seconds
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    List<WebElement> productCards = driver.findElements(By.cssSelector(".product-card"));

    // Loop through each product card and print its name and price
    for (WebElement card : productCards) {
      // Find the name and price elements within the card
      WebElement nameElement = card.findElement(By.cssSelector(".product-card__title-link"));
      WebElement priceElement = card.findElement(By.cssSelector(".product-card__price"));

      // Get the text values of the name and price elements
      String name = nameElement.getText();
      String price = priceElement.getText();

      // Remove the currency symbol from the price string
      price = price.substring(1);

      // Print the name and price
      System.out.println(name + " - " + price);
      System.out.println(productCards.size() + " product cards found");

    }

    // Close the browser
    base.seleniumClose(driver);
  }
}
