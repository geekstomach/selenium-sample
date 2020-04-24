package Pages;

import Base.TestBase;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends TestBase {


    public MainPage() {
        PageFactory.initElements(driver, this);
    }

    public String verifyMainPageTitle(){
        return driver.getTitle();
    }

}
