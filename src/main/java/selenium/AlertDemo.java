package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.Alert;

public class AlertDemo {

  public static void main(String[] args) throws NoAlertPresentException,InterruptedException  {

    SeleniumBase base = new SeleniumBase();
    ChromeDriver driver = base.seleniumInit("https://demo.guru99.com/test/delete_customer.php");


    // Alert Message handling

    driver.findElement(By.name("cusid")).sendKeys("53920");
    driver.findElement(By.name("submit")).submit();

    // Switching to Alert
    Alert alert = driver.switchTo().alert();

    // Capturing alert message.
    String alertMessage= driver.switchTo().alert().getText();

    // Displaying alert message
    System.out.println(alertMessage);
    Thread.sleep(5000);

    // Accepting alert
    alert.accept();
  }

}
		