import Base.TestBase;
import Pages.MainPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MainPageTest extends TestBase {

    MainPage mainPage;

    public MainPageTest() {
        super();
    }

    @BeforeMethod
    public void setUp() {
        initialization();
        mainPage = new MainPage();
    }


    @Test(priority=1)
    public void verifyHomePageTitleTest(){
        String homePageTitle = mainPage.verifyMainPageTitle();
        Assert.assertEquals(homePageTitle, "GeekBrains - образовательный портал");
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

}
