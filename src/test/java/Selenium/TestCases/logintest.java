package Selenium.TestCases;

import Selenium.BaseTest.BaseTest;
import org.testng.annotations.*;

public class logintest extends BaseTest {
    @Test(priority = 0)
    public void login() throws Exception {
        try {

            log.info("*************** Entering login Admin**************");
            System.out.println("First Test ................");
            pageObj.type(pageObj.username, "training@jalaacademy.com");
            pageObj.type(pageObj.password, "jobprogram");
            pageObj.click(pageObj.remember);
            pageObj.click(pageObj.login);
            Thread.sleep(3000);
            log.info("*************** leaving login Admin**************");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @AfterTest
    public void quit() {
        driver.quit();
    }

}
