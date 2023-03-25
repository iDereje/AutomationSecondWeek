package selenium.pageObjectExample.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.FindBy;
import selenium.pageObjectExample.pages.SeleniumBaseFireFox;

public class YoutubeTest {

  public static void main(String[] args) {
    SeleniumBaseFireFox base = new SeleniumBaseFireFox();
  FirefoxDriver driver = base.seleniumInit("https://www.youtube.com/");
FirefoxOptions options = new FirefoxOptions();
    options.addPreference("security.insecure_field_warning.contextual.enabled", false);


    // Login
    WebElement signInButton = driver.findElement(By.xpath("//*[@id='buttons']/ytd-button-renderer/yt-button-shape/a/yt-touch-feedback-shape/div/div[2]"));
    signInButton.click();

    WebElement emailField = driver.findElement(By.id("identifierId"));
    emailField.sendKeys("xboxdereje@gmail.com"); // replace with your email address
    emailField.sendKeys(Keys.ENTER);

WebElement das = driver.findElement(By.cssSelector(".ytd-watch-next-secondary-results-renderer:nth-child(1) > #dismissible .yt-core-image--fill-parent-height"));
das.sendKeys(Keys.ESCAPE);
das.sendKeys(Keys.ESCAPE);
das.sendKeys(Keys.ESCAPE);

    WebElement passwordField = driver.findElement(By.name("password"));
    passwordField.sendKeys("BFpGEA7x9uCj3wc"); // replace with your password

    WebElement signInButton2 = driver.findElement(By.xpath("//button[@id='passwordNext']"));
    signInButton2.click();

    // Search for a video
    WebElement searchField = driver.findElement(By.id("search"));
    searchField.sendKeys("selenium tutorial");

    WebElement searchButton = driver.findElement(By.xpath("//button[@id='search-icon-legacy']"));
    searchButton.click();

    // Click on the first video in the search results
    WebElement firstVideo = driver.findElement(By.xpath("(//a[@id='video-title'])[1]"));
    firstVideo.click();



    driver.quit();
  }

}
