package browseFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {
    public static WebDriver driver;
    String url = "https://opensource-demo.orangehrmlive.com/";

    public void setup(String url){
        driver = new FirefoxDriver();
        driver.get(url);
        driver.manage().window().maximize();

    }
    public void closeBrowser(){driver.quit();}
}
