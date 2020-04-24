import Base.TestBase;
import Pages.AuthPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AuthPageTest extends TestBase {
    AuthPage authPage;

    public AuthPageTest(){
        super();
    }

    @BeforeMethod
    public void setUp(){
        initialization();
        driver.get(prop.getProperty("url")+"/login");
        authPage = new AuthPage();
    }

    @Test(priority=1)
    public void authPageTitleTest(){
        String title = authPage.validateAuthPageTitle();
        Assert.assertEquals(title, "Вход | GeekBrains - образовательный портал");
    }

    @Test(priority=3)
    public void loginTest(){ authPage.login(prop.getProperty("username"), prop.getProperty("password"));
    }



    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

}
