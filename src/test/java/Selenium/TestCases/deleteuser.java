package Selenium.TestCases;

import Selenium.BaseTest.BaseTestWithLogin;
import org.testng.annotations.*;


public class deleteuser extends BaseTestWithLogin {
    @Test(priority = 1)
    public void searchuser() throws Exception {
        try {
            log.info("*************** Entering Search Page **************");
            System.out.println("First Test ................");
            pageObj.click(pageObj.Employee);
            Thread.sleep(1000);
            pageObj.click(pageObj.search_tab);
            Thread.sleep(500);
            pageObj.type(pageObj.Search_name, "Aftab");
            pageObj.click(pageObj.search_user);
            Thread.sleep(1000);
            System.out.println("First Test completed ................");
            log.info("*************** Holding on search page **************");
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    @Test(priority = 2)
    public void deleteuser() throws Exception {
        try {
            log.info("*************** Into Search Page **************");
            System.out.println("Second Test ................");
            pageObj.click(pageObj.delete);
            Thread.sleep(800);
            pageObj.click(pageObj.confirm);
            System.out.println("Second Test completed ................");
            log.info("*************** exiting Search Page **************");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    @AfterTest
    public void quit() throws Exception {
        Thread.sleep(1000);
        driver.quit();
    }
}
