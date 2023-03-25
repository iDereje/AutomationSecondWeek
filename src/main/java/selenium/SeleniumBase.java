package selenium;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

    public class SeleniumBase {


        public ChromeDriver  seleniumInit(String url){
            System.out.println("Starting...");
            ChromeOptions option = new ChromeOptions();
            option.addArguments("--remote-allow-origins=*");

            WebDriverManager.chromedriver().setup();
            ChromeDriver driver = new ChromeDriver(option);

            driver.get(url);
            return driver;
        }
        public void seleniumClose (ChromeDriver driver) {
            driver.close();
        }

    }

