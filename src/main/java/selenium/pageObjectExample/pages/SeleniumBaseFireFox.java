package selenium.pageObjectExample.pages;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;


public class SeleniumBaseFireFox {


    public FirefoxDriver seleniumInit(String url) {

        System.out.println("Starting...");


        FirefoxDriver driver = new FirefoxDriver();
        WebDriverManager.firefoxdriver().setup();

        driver.get(url);
        return driver;
    }




    public void seleniumClose (FirefoxDriver driver) {
        driver.close();
    }

}
