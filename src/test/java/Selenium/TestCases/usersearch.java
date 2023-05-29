package Selenium.TestCases;

import Selenium.BaseTest.BaseTestWithLogin;
import org.testng.annotations.*;

public class usersearch extends BaseTestWithLogin {
    @Test(priority = 1)
    public void SearchUser() {
        try {
            log.info("*************** Entering Search Page **************");
            System.out.println("First Test ................");
            pageObj.click(pageObj.Employee);
            Thread.sleep(500);
            pageObj.click((pageObj.search_tab));
            pageObj.type(pageObj.Search_name, "Aftab");
            pageObj.click((pageObj.search_user));
            System.out.println("First Test completed ................");
            log.info("*************** exiting Search Page **************");
            Thread.sleep(1500);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    @AfterTest
    public void Quit() {
        try {
            driver.quit();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
