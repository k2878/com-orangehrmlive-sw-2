package testSuite;
import java.lang.Thread;
import browseFactory.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.junit.Assert;
public class LoginTest extends BaseTest {
 String url = "https://opensource-demo.orangehrmlive.com/";
    @Before
    public void setUp() {
        setup(url);
    }


    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() throws InterruptedException {
        Thread.sleep(1000);

        WebElement enterUserName = driver.findElement(By.xpath("//input[@name='username']"));
        enterUserName.sendKeys("Admin");
        
        WebElement enterPassword = driver.findElement(By.xpath("//input[@name='password']"));
        enterPassword.sendKeys("admin123");

        WebElement loginButton = driver.findElement(By.xpath("//div[@class='oxd-form-actions orangehrm-login-action']"));
        loginButton.click();

        //String actualText = driver.findElement(By.xpath("//span[@class='oxd-topbar-header-breadcrumb']")).getText();
       // String expectedText = "Dashboard";
        //Assert.assertEquals(actualText,expectedText);



    }
    @After
    public void endTest(){
        closeBrowser();
    }
}

