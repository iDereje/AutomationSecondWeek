package selenium.pageObjectExample.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import selenium.SeleniumBase;

import java.util.List;

public class SelectClass {
  public static void main(String[] args) throws InterruptedException {

    SeleniumBase base = new SeleniumBase();
    ChromeDriver driver = base.seleniumInit("http://www.demoaut.com/");
    Thread.sleep(3000);
    driver.findElement(By.name("userName")).sendKeys("mercury");
    driver.findElement(By.name("password")).sendKeys("mercury");
    driver.findElement(By.name("login")).click();
    Thread.sleep(10000);
    driver.findElement(By.name("fromPort"));

    //Step 1 Create object of WebElement
   List<WebElement> objWeb = (List<WebElement>) driver.findElement(By.name("fromPort"));
   for (WebElement objectsWeb:objWeb){
     objWeb.indexOf(0);
   }
//Step 2 Create obj of Select Class and pass the web element name to the argument


    //Step 3 using the given name of the Select obj you calling a methods



  }
}
