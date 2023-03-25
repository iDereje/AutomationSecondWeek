import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SeleniumBase {

  public ChromeDriver seleniumInit(String url) {
    System.out.println("Starting...");
    ChromeOptions options = new ChromeOptions();
    options.addArguments("--remote-allow-origins=*");
    options.setAcceptInsecureCerts(true);
    options.addArguments("--disable-blink-features=AutomationControlled");

    ChromeDriver driver = new ChromeDriver(options);
    WebDriverManager.chromedriver().setup();
    driver.get(url);
    return driver;
  }

  public void seleniumClose(ChromeDriver driver) {
    driver.close();
  }
}
