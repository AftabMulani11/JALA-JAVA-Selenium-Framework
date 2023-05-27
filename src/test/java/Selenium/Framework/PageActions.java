package Selenium.Framework;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class PageActions extends pageObjects {
    public PageActions(WebDriver driver) {
        super(driver);
    }
    public void click(WebElement ele) {
        System.out.println("In click method");
        ele.click();
    }
    public void type(WebElement ele, String msg) {
        System.out.println("In type method");
        ele.clear();
        ele.sendKeys(msg);
    }

}
