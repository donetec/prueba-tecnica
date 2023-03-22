package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class General_Page {

    public static ChromeDriver inicio(){

        System.setProperty("webdriver.chrome.driver","C:\\Users\\onetec\\Desktop\\PruebaTecnica\\src\\test\\resources\\driver\\chromedriver.exe");

        ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");
        return new ChromeDriver(option);
    }
}
