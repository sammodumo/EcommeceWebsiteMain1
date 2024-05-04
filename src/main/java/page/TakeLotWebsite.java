package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v123.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TakeLotWebsite {
    WebDriver driver;

    public TakeLotWebsite(WebDriver webDrivers){
        driver = webDrivers;

        PageFactory.initElements(driver,this);

    }

    @FindBy(xpath = "//*[@id=\"shopfront-app\"]/div[2]/div/div/div[2]/div/div[1]/ul/li[1]/a")
    private WebElement logIn;

    @FindBy(xpath = "//*[@id=\"customer_login_email\"]")
    private WebElement emailAddress;

    @FindBy(xpath = "//*[@id=\"customer_login_password\"]")
    private WebElement password;

    @FindBy(xpath = "//*[@id=\"body\"]/div[4]/div/div/div/div/div/div/div[1]/div/div/div[1]/form/div[6]/div/button")
    private WebElement loginBtn;


    public void logInPage(){
        logIn.click();
    }

    public void enterEmailAddress(){
        emailAddress.sendKeys("modumosam44@gmail.com");
    }

    public void enterPassword(){
        password.sendKeys("Ms@980108");
    }

    public void clickLogInBtn(){
        loginBtn.click();
    }


}
