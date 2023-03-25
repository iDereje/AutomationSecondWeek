package selenium.pageObjectExample.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class AmazonPage {
  private WebDriver driver;

  public AmazonPage(WebDriver driver) {
    this.driver = driver;
    PageFactory.initElements(driver, this);
  }

  @FindBy(id = "twotabsearchtextbox")
   WebElement searchBox;

  @FindBy(id = "nav-search-submit-button")
   WebElement searchButton;




  @FindBy(xpath = "//span[@class='a-price-whole']")
  List<WebElement>  bookPrices;


  public  void searchbook(String searchBox1){


    searchBox.clear();
    searchBox.sendKeys(searchBox1);
    searchButton.click();

  }

  public void getBookPrices() {
    for (WebElement price : bookPrices) {
      String priceName = price.getText().replace("$", "");
      System.out.println(priceName);
    }
  }
  }

