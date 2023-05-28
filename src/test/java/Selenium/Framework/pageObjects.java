package Selenium.Framework;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class pageObjects {
    public WebDriver driver;
    public pageObjects(WebDriver driver){

        this.driver=driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//input[@id='UserName']")
    public WebElement username;

    @FindBy(xpath = "//input[@id='Password']")
    public WebElement password;

    @FindBy(xpath = "//span[@class='checkmark']")
    public WebElement remember;

    @FindBy(xpath = "//button[@id='btnLogin']")
    public WebElement login;

    @FindBy(xpath = "//a[normalize-space()='Employee']")
    public WebElement Employee;

    @FindBy(xpath = "//a[normalize-space()='Create']")
    public WebElement create;

    @FindBy(xpath = "//a[normalize-space()='Search']")
    public WebElement search;

    @FindBy(xpath = "//input[@id='Name']")
    public WebElement Search_name;

    @FindBy(xpath = "//button[@id='btnSearch']")
    public WebElement search_user;

    @FindBy(xpath = "//input[@id='FirstName']")
    public WebElement first_name;

    @FindBy(xpath = "//input[@id='LastName']")
    public WebElement last_name;

    @FindBy(xpath = "//input[@id='EmailId']")
    public WebElement email_id;

    @FindBy(xpath = "//input[@id='MobileNo']")
    public WebElement mobile;

    @FindBy(xpath = "//input[@id='DOB']")
    public WebElement dob;

    @FindBy(xpath = "//input[@value='M']")
    public WebElement male_btn;

    @FindBy(xpath = "//input[@value='F']")
    public WebElement female_btn;

    @FindBy(xpath = "//textarea[@placeholder='Address']")
    public WebElement address;

    @FindBy(xpath = "//select[@id='CountryId']")
    public WebElement country;

    @FindBy(xpath = "//select[@id='CountryId']//option[@value='1']")
    public WebElement india;

    @FindBy(xpath = "//select[@id='CityId']")
    public WebElement city;

    @FindBy(xpath = "//select[@id='CityId']//option[@value='5']")
    public WebElement pune;

    @FindBy(xpath = "//input[@id='chkSkill_1']")
    public WebElement skill1;

    @FindBy(xpath = "//input[@id='chkSkill_2']")
    public WebElement skill2;

    @FindBy(xpath = "//input[@id='chkSkill_3']")
    public WebElement skill3;

    @FindBy(xpath = "//input[@id='chkSkill_4']")
    public WebElement skill4;

    @FindBy(xpath = "//input[@id='chkSkill_5']")
    public WebElement skill5;

    @FindBy(xpath = "//input[@id='chkSkill_6']")
    public WebElement skill6;

    @FindBy(xpath = "//button[normalize-space()='Save']")
    public WebElement save;



}
