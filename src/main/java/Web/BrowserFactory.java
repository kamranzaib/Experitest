package Web;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserFactory {

    public static WebDriver RunBrowser(String BrowserName){

        WebDriver driver = null;

        switch (BrowserName){
            case "Chrome":{
                driver = new ChromeDriver();
                break;
            }
            case "firefox":{
                driver = new FirefoxDriver();
                break;
            }
            case "IE":{
                driver = new InternetExplorerDriver();
                break;
            }
        }

        driver.manage().window().maximize();


        return driver;


    }

}
