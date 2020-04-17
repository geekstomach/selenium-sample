package Pages;

import Base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CareerPage extends TestBase {

/*    @FindBy(xpath = "/html/body/div[1]/div[9]/div/project/section/project-tabs/div/div[1]/div[2]/ul/li[1]/a")
    WebElement vacancyBtn;*/

    @FindBy(linkText = "Вакансии")
    WebElement vacancyBtn;

    @FindBy(xpath = "//*[contains(text(), 'Тестировщик ПО')]")
    WebElement findByText;

    public CareerPage(){
        PageFactory.initElements(driver, this);
    }

    //Actions:
    public String validateCareerPageTitle(){
        return driver.getTitle();
    }

    public String hasText(){
        return findByText.toString();}

}