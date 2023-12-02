package testSuite;

import browseFactory.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.junit.Assert;
public class ForgotPasswordTest extends BaseTest {
    String url = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setUp() {
        setup(url);
    }


    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully() {

        WebElement forgotPassword = driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']"));
        forgotPassword.click();


        String actualText = driver.findElement(By.xpath("//form[@class='oxd-form']/h6")).getText();
        String expectedText = "Reset Password";
        Assert.assertEquals(actualText, expectedText);
    }

    @After
    public void endTest() {
        closeBrowser();
    }
}





