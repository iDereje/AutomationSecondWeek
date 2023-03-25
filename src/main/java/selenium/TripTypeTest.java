package selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TripTypeTest {
    public static void main(String[] args) throws InterruptedException {

        SeleniumBase base = new SeleniumBase();
        ChromeDriver driver = base.seleniumInit("https://demo.guru99.com/test/newtours/reservation.php");
List <WebElement> tripType = driver.findElements(By.name("tripType"));

        WebElement oneWay = tripType.get(1);
        oneWay.click();
        base.seleniumClose(driver);
    }
}
