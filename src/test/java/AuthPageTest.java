import Base.TestBase;
import Pages.AuthPage;
import Pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AuthPageTest extends TestBase {
    AuthPage authPage;
    HomePage homePage;

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

/*    @Test(priority=2)
    public void crmLogoImageTest(){
        boolean flag = authPage.validateCRMImage();
        Assert.assertTrue(flag);
    }*/

    @Test(priority=3)
    public void loginTest(){
        homePage = authPage.login(prop.getProperty("username"), prop.getProperty("password"));
    }



    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

}
