package selenium.pageObjectExample.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class YoutubeTest {



  public static void main(String[] args) {
SeleniumBase base = new SeleniumBase();


       ChromeDriver  driver = base.seleniumInit("https://www.youtube.com/");

    // Login
    WebElement signInButton = driver.findElement(By.xpath("//*[@id='buttons']/ytd-button-renderer/yt-button-shape/a/yt-touch-feedback-shape/div/div[2]"));
    signInButton.click();

    WebElement emailField = driver.findElement(By.id("identifierId"));
    emailField.sendKeys("xboxdereje@gmail.com"); // replace with your email address
    emailField.sendKeys(Keys.ENTER);

WebElement das = driver.findElement(By.cssSelector("input.zHQkBf"));
das.sendKeys("BFpGEA7x9uCj3wc");
das.sendKeys(Keys.ENTER);

    // Search for a video
    WebElement searchField = driver.findElement(By.id("search"));
    searchField.click();
    searchField.sendKeys("selenium tutorial");

    WebElement searchButton = driver.findElement(By.xpath("//button[@id='search-icon-legacy']"));
    searchButton.click();

    // Click on the first video in the search results
    WebElement firstVideo = driver.findElement(By.xpath("(//a[@id='video-title'])[1]"));
    firstVideo.click();



    driver.quit();
  }

}
