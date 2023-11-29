package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class ForgotPasswordTest extends BaseTest {

    String baseurl="https://opensource-demo.orangehrmlive.com/";
    @Before
    public void openBrowser(){
        openBrowser(baseurl);
    }
    @Test
   public void userShouldNavigateToForgotPasswordPageSuccessfully(){
      //click on the ‘Forgot your password’ link
        driver.findElement(By.xpath("//p[@class=\"oxd-text oxd-text--p orangehrm-login-forgot-header\"]")).click();

 String actualResult=driver.findElement(By.xpath("//div[@class='orangehrm-forgot-password-wrapper']/div/form/h6")).getText();
    System.out.println(actualResult);
      String expectedResult="Reset Password";
    Assert.assertEquals(expectedResult,actualResult);




   }

    @After
    public void endTest(){
         // closeBrowser();
    }
}
