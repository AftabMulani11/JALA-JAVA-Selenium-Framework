package Selenium.BaseTest;


import Selenium.Framework.PageActions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
import org.testng.annotations.*;
import java.util.logging.Logger;

public class BaseTest {

    protected WebDriver driver;
    protected PageActions pageObj;
    public static String URL = "http://magnus.jalatechnologies.com/";
    protected Logger log = Logger.getLogger("devpinoyLogger");
    @BeforeTest
    public void setUp() {
        System.out.println("Before Method ");
        try {
            System.out.println("launching chrome browser");
            ChromeOptions option = new ChromeOptions();
            option.addArguments("--remote-allow-origins=*");
            driver = new ChromeDriver(option);
            driver.manage().window().maximize();
            driver.get(URL);
            System.out.println("Application launched successfully");
            pageObj = new PageActions(driver);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}