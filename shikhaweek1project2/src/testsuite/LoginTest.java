package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class LoginTest extends BaseTest {
    String baseurl="https://opensource-demo.orangehrmlive.com/";
    @Before
    public void openBrowser(){
        openBrowser(baseurl);
    }
    @Test
    public void userSholdLoginSuccessfullyWithValidCredentials() {
        //Enter “Admin” username
        driver.findElement(By.xpath("//form[@class='oxd-form']/div[1]/div/div[2]/input")).sendKeys("Admin");
      //  Enter “admin123“ password
driver.findElement(By.xpath("//form[@class='oxd-form']/div[2]/div[1]/div[2]/input")).sendKeys("admin123");

        //Click on ‘LOGIN’ button
        driver.findElement(By.xpath("//div[@class='orangehrm-login-slot']/div[2]/form/div[3]/button")).click();
//      driver.findElement(By.xpath("//nav[@class='oxd-navbar-nav']/div[2]/ul/li[8]/a")).getText();
//    String actualResult=driver.findElement(By.xpath("//nav[@class='oxd-navbar-nav']/div[2]/ul/li[8]/a")).getText();
//        System.out.println(actualResult);
//    //String expectedResult="Dashboard";
      //  Assert.assertEquals(expectedResult,actualResult);
    }


        @After
        public void endTest(){
            //  closeBrowser();
        }
    }
