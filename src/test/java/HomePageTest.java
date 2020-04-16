import Base.TestBase;
import Pages.AuthPage;
import Pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest extends TestBase {
    AuthPage authPage;
    HomePage homePage;
    /*TestUtil testUtil;
    ContactsPage contactsPage;*/

    public HomePageTest() {
        super();
    }

    //test cases should be separated -- independent with each other
    //before each test case -- launch the browser and login
    //@test -- execute test case
    //after each test case -- close the browser

    @BeforeMethod
    public void setUp() {
        initialization();
        homePage = new HomePage();
/*        testUtil = new TestUtil();
        contactsPage = new ContactsPage();
        authPage = new AuthPage();
        homePage = authPage.login(prop.getProperty("username"), prop.getProperty("password"));
    */
    }


    @Test(priority=1)
    public void verifyHomePageTitleTest(){
        String homePageTitle = homePage.verifyHomePageTitle();
        Assert.assertEquals(homePageTitle, "GeekBrains - образовательный портал","Home page title not matched");
    }

/*    @Test(priority=2)
    public void verifyUserNameTest(){
        testUtil.switchToFrame();
        Assert.assertTrue(homePage.verifyCorrectUserName());
    }

    @Test(priority=3)
    public void verifyContactsLinkTest(){
        testUtil.switchToFrame();
        contactsPage = homePage.clickOnContactsLink();
    }*/



    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

}
