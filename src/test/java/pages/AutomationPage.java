package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AutomationPage {
    public AutomationPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@href='/login']")
    public WebElement signupLoginButonu;

    @FindBy(xpath = "//h2[text()='New User Signup!']")
    public WebElement SingupMessage;

    @FindBy(xpath ="//input[@data-qa='signup-name']")
    public WebElement SignupName;
    @FindBy(xpath ="//input[@data-qa='signup-email']")
    public WebElement SignupEmail;

    @FindBy(xpath ="//button[@data-qa='signup-button']")
    public WebElement SignupButtonu;

    @FindBy(xpath = "//b[text()='Enter Account Information']")
    public WebElement hesapBilgileri;

    @FindBy(id ="id_gender2")
    public WebElement MrsTitle;

    @FindBy(id ="password")
    public WebElement password;

    @FindBy(id = "days")
    public WebElement dayDdm;

    @FindBy(id="months")
    public WebElement monthDdm;

    @FindBy(id="years")
    public WebElement yearDdm;

    @FindBy(id = "newsletter")
    public WebElement bultenKayitOnayKutusu;

    @FindBy(id="optin")
    public WebElement ozelTeklifOnayKutusu;
}
