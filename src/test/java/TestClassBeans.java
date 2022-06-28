import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

// Add Firefox integration

public class TestClassBeans {

    WebDriver driver;
   // String url = "http://www.google.com";

    @BeforeTest
    void setup() {
        System.out.println("Google Test Instantiate");
        String path = System.getProperty("user.dir") + "\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", path);
        driver = new ChromeDriver();

      /*  System.out.println("Firefox Test Instantiate");
        String path2 = System.getProperty("user.dir") + "\\geckodriver.exe";
        System.setProperty("webdriver.gecko.driver", path2);
        driver = new FirefoxDriver();
       */


    }

    @Test
    void testSteps(){
        GooglePage gp = new GooglePage(driver);
        gp.GoogleSearchTest();

       // FirefoxPage fp = new FirefoxPage(driver);
      //  fp.duck_duck_search_test();

    }


    @AfterTest
    void tearDown(){
        System.out.println("I am in the TearDown.");
        driver.quit();

    }
}

