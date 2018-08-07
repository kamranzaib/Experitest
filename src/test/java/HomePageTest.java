import HomePage.tableData;
import Web.BrowserFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class HomePageTest {

    WebDriver driver = BrowserFactory.RunBrowser("Chrome");
    tableData tableinfo = PageFactory.initElements(driver, tableData.class);

    @Test public void storeInfo(){
        driver.get("https://www.premierleague.com/tables");

        tableinfo.getData();

    }



}
