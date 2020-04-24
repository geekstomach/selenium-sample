package Pages;

import Base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CareerPage extends TestBase {


    @FindBy(partialLinkText = "Образовательный портал GeekBrains") //сюда в принципе в идеале можно будет потом передвать последовательно все компании какие есть по названию
    WebElement vacancyBtn;
    //Образовательный портал GeekBrains
/*    //<элемент>[contains(<аттрибут>=<значение>)] => у элемента есть аттрибут равный указанному значению
    //<элемент>[contains(<аттрибут>,<значение>)] => у элемента есть аттрибут, в значении которого содержится указанное значение
    @FindBy(xpath = "//*[contains(text(), 'тестировани')]")*/

    @FindBy(partialLinkText = "Преподаватель курса \"Автоматизированное тестирование на Java\"") //сюда в принципе в идеале можно будет потом передвать последовательно все компании какие есть по названию
            WebElement testVacancyBtn;


    public CareerPage(){
        PageFactory.initElements(driver, this);
    }

    //Actions:
    public String validateCareerPageTitle(){
        return driver.getTitle();
    }

    public String hasText(){

        return testVacancyBtn.toString();}

    public void clickOnVacancy(){
        vacancyBtn.click();
    }

}