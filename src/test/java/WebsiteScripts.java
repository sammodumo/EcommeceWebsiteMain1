import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import page.TakeLotWebsite;

public class WebsiteScripts {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverManager.edgedriver().create();

        driver.get("https://www.takealot.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        TakeLotWebsite logIn = new TakeLotWebsite(driver);

        logIn.logInPage();
        Thread.sleep(2000);

        logIn.enterEmailAddress();
        Thread.sleep(2000);

        logIn.enterPassword();
        Thread.sleep(2000);

        logIn.clickLogInBtn();
        Thread.sleep(4000);





    }
}
