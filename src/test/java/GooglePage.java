import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import javax.print.DocFlavor;

public class GooglePage {
    WebDriver driver;
    String url = "http://www.google.com";
    By searchbox = By.name("q");
    public GooglePage(WebDriver d){
        driver = d;
        System.out.println("I am inside testSteps");

    }
    public void GoogleSearchTest(){
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

