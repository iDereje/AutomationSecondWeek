package selenium.pageObjectExample.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProdPage {

    private WebDriver driver;

//    @FindBy(name="q")
//    WebElement search ;

    public ProdPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }


}
