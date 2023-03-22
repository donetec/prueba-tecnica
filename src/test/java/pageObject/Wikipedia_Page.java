package pageObject;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;

import java.io.File;
import java.io.IOException;

public class Wikipedia_Page extends General_Page {

    private static WebDriver driver = inicio();

    public static void buscar(String busqueda, String urlBuscador) {

        driver.get(urlBuscador);

        WebElement webElement = driver.findElement(By.xpath("//button/div[text() = 'Aceptar todo']"));
        webElement.click();

        webElement = driver.findElement(By.xpath("//input[@type = 'text'] | //textarea[@type = 'search']"));
        webElement.clear();
        webElement.sendKeys(busqueda);

        webElement = driver.findElement(By.xpath("(//input[@value = 'Buscar con Google'])[2]"));
        webElement.click();
    }

    public static void navegarAlResultado(String web) {
        WebElement webElement = driver.findElement(By.xpath("(//a/h3[contains(text(), '" + web + "') and contains(text(), 'Automatización')])[1]"));
        webElement.click();

    }

    public static void comprobar(String anio) throws IOException {
        WebElement webElement = driver.findElement(By.xpath("//p[contains(text(), '" + anio + "')]"));
        webElement.click();

        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File destFile=new File("C:\\captura\\prueba.jpg");

        FileUtils.copyFile(screenshot, destFile);
    }
}
