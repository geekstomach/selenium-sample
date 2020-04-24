import Base.TestBase;
import Pages.CareerPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CareerPageTest extends TestBase {

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
        Assert.assertTrue(careerPage.hasText().contains("тестировани"));
    }


    @Test
    public void hasTextTest2(){

        careerPage.clickOnVacancy();
        WebElement testVacancyBtn = driver.findElement(By.partialLinkText("Преподаватель курса \"Автоматизированное тестирование на Java\""));
        Assert.assertTrue(testVacancyBtn.getText().contains("тестировани"));
    }
    @AfterMethod
    public void tearDown(){

        driver.quit();
    }
}
