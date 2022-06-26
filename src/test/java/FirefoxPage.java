import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FirefoxPage {
    WebDriver driver;
    String url = "http://www.duckduckgo.com";
    By searchbox = By.name("q");

    public FirefoxPage(WebDriver d){
        driver = d;
        System.out.println("I am in Firefox Page");

    }
    public void duck_duck_search_test(){
        geturl(url);
        String searchterm = "Eurorack";
        SendText(searchbox, searchterm);
        SendText(searchbox, Keys.ENTER);

        WebElement searchresult1 = driver.findElement(By.xpath("(//h3[contains(text(),'Eurorack')])[1]"));
        String expectedresult = "Eurorack - Wikipedia";
        assert (searchresult1.getText().equals(expectedresult));
    }
    public void SendText(By by, String texttosend){
        driver.findElement(by).sendKeys(texttosend);

    }
    public void SendText(By by, Keys key){
        driver.findElement(by).sendKeys(key);

    }
    public void geturl(String url){
        driver.get(url);

    }
}
