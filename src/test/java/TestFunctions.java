import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class TestFunctions {
    WebDriver driver;

    public void SendText(By by, String texttosend){
        driver.findElement(by).sendKeys(texttosend);

    }
    public void SendText(By by, Keys key){
        driver.findElement(by).sendKeys(key);

    }

    //Problem here with the function geturl returning void in main test class?
    public void geturl(String url){
        driver.get(url);
       // driver.getCurrentUrl();
    }
}
