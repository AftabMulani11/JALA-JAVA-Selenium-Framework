package Selenium.TestCases;

import Selenium.BaseTest.BaseTestWithLogin;
import org.testng.annotations.*;

public class adduser extends BaseTestWithLogin {
    @Test(priority = 1)
    public void useraddition() throws Exception {
        try {
            log.info("*************** Entering User add Page **************");
            System.out.println("Entering first test");
            pageObj.click(pageObj.Employee);
            pageObj.click((pageObj.create));
            pageObj.type(pageObj.first_name, "Aftab");
            pageObj.type(pageObj.last_name, "Mulani");
            pageObj.type(pageObj.email_id, "aftabmulani001@gmail.com");
            pageObj.type(pageObj.mobile, "7972281955");
            pageObj.type(pageObj.dob, "11/09/2001");
            pageObj.click(pageObj.male_btn);
            pageObj.type(pageObj.address, "Sr. No. 70B, Armaan Manzil, Sainath Colony, Manjari Bk., Pune-412307");
            pageObj.click(pageObj.country);
            pageObj.click(pageObj.india);
            pageObj.click(pageObj.city);
            pageObj.click(pageObj.pune);
            pageObj.click(pageObj.skill1);
            pageObj.click(pageObj.skill2);
            pageObj.click(pageObj.skill3);
            pageObj.click(pageObj.skill4);
            pageObj.click(pageObj.skill5);
            pageObj.click(pageObj.skill6);
            Thread.sleep(2500);
            pageObj.click(pageObj.save);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
    @Test(priority = 2)
    public void showingResult() throws Exception {
        Thread.sleep(3500);
        pageObj.type(pageObj.Search_name, "Aftab");
        pageObj.click((pageObj.search_user));
    }
    @AfterTest
    public void exit() throws Exception {
        Thread.sleep(3000);
        driver.quit();
        System.out.println("Exciting test with successfull Result");
    }
}
