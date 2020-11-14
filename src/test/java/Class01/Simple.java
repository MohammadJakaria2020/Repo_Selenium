package Class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Simple {

    @Test
    public void launchPage(){
        System.setProperty("webdriver.chrome.driver","./DriverExe/chromedriver");
        WebDriver driver = new ChromeDriver();

        // WebDriver driver : driver is a variable of WebDriver
        // new ChromeDriver(): Creating object of ChromeDriver class
        // String the object of ChromeDriver class into WebDriver variable
        // ChromeDriver extends RemoteWebDriver; RemoteWebDriver extends WebDriver


        /** To launch a webpage:
         *  get method
         */
        driver.get("https://www.facebook.com");







    }

}
