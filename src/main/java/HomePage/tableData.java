package HomePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileWriter;
import java.io.IOException;

public class tableData {
    WebDriver driver;

    @FindBy(xpath = "//*[@id=\"mainContent\"]/div/div[1]/div[3]/div/div")
    WebElement tablOfLeague;





    public tableData(WebDriver driver) {

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void getData(){
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOf(tablOfLeague));
        String dataoutput;
        dataoutput = tablOfLeague.getText();
        System.out.println(dataoutput);

        String csvOutputFile = "table.csv";

        try(FileWriter writecsv = new FileWriter("src/main/table.csv")) {
            writecsv.append(dataoutput);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}




