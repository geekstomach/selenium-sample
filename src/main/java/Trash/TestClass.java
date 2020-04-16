package Trash;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URI;

public class TestClass {


    public static void main(String[] args) throws InterruptedException {
        //https://stackoverflow.com/questions/38676719/selenium-using-java-the-path-to-the-driver-executable-must-be-set-by-the-webdr
        //https://github.com/mozilla/geckodriver/releases/tag/v0.26.0
        //if you didn't update the Path system variable to add the full directory path to the executable as above mentioned then doing this directly through code
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Orange\\IdeaProjects\\selenium-sample\\geckodriver.exe");

/*//Now you can Initialize marionette driver to launch firefox
        DesiredCapabilities capabilities = DesiredCapabilities.firefox();

        capabilities.setCapability("marionette", true);
        WebDriver driver = new MarionetteDriver(capabilities);*/
        String URL = "https://geekbrains.ru/";
        WebDriver driver = new FirefoxDriver();
        driver.get(URL);
        /*WebElement element = driver.findElement(By.xpath("//input[@name='emailid']"));
        element.sendKeys("abc@gmail.com");
        WebElement button=driver.findElement(By.xpath("//input[@name='btnLogin']"));
        button.click();*/
        Thread.sleep(3000); //wait for 3 seconds
        driver.quit();      //close Chrome
    }
}
