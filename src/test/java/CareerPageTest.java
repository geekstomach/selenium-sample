import Base.TestBase;
import Pages.AuthPage;
import Pages.CareerPage;
import Pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CareerPageTest extends TestBase {
    HomePage homePage;
    AuthPage authPage;
    CareerPage careerPage;

    public CareerPageTest(){
        super();
    }

    @BeforeMethod
    public void setUp(){
        initialization();
        driver.get(prop.getProperty("url")+"/career");
        careerPage = new CareerPage();
    }

    @Test(priority=1)
    public void careerPageTitleTest(){

        String title = careerPage.validateCareerPageTitle();
        Assert.assertEquals(title, "Карьера | GeekBrains - образовательный портал");
    }
    @Test
    public void hasTextTest(){
        Assert.assertTrue(careerPage.hasText().contains("Тестировщик ПО"));
    }

}
