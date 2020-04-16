package Pages;

import Base.TestBase;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AuthPage extends TestBase {
    //Page Factory - OR:
    @FindBy(id="user_email")
    WebElement username;

    @FindBy(id="user_password")
    WebElement password;

    @FindBy(xpath="//input[@type='submit']")
    WebElement loginBtn;


    public AuthPage(){
        PageFactory.initElements(driver, this);
    }

    //Actions:
    public String validateAuthPageTitle(){
        return driver.getTitle();
    }

/*    public boolean validateCRMImage(){
        return crmLogo.isDisplayed();
    }*/

    public HomePage login(String un, String pwd){

        username.sendKeys(un);
        password.sendKeys(pwd);
        //loginBtn.click();
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();", loginBtn);

        return new HomePage();
    }
}
