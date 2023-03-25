package selenium.pageObjectExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import selenium.SeleniumBase;

import java.util.List;

public class FindElements3 {
  public static void main(String[] args) {
    SeleniumBase base = new SeleniumBase();
    ChromeDriver driver = base.seleniumInit("https://www.demoqa.com.books");

    WebElement firstColumne = driver.findElement(By.className("rt-resizable-header-content"));

    List<WebElement> headers = driver.findElements(By.className("rt-resizable-header-content"));



            base.seleniumClose(driver);
  }
}
