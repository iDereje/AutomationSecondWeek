package selenium.pageObjectExample.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    private WebDriver driver;


    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String printUserPw(String user, String password) {
        System.out.println("");
        if(user.length()==4) {
            System.out.println("User lenght is 4 ");



    }
    return user;
    }



}
