package selenium.pageObjectExample.tests;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import selenium.SeleniumBase;

class fileUploadDoc{
  public static void main(String[] args) {
    SeleniumBase base = new SeleniumBase();
    ChromeDriver driver = base.seleniumInit("https://the-internet.herokuapp.com/upload");

    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    //we want to import selenium-snapshot file.
    driver.findElement(By.id("file-upload")).sendKeys("selenium-snapshot.jpg");
    driver.findElement(By.id("file-submit")).submit();
    if(driver.getPageSource().contains("File Uploaded!")) {
      System.out.println("file uploaded");
    }
    else{
      System.out.println("file not uploaded");
    }
    driver.quit();
  }
}

  