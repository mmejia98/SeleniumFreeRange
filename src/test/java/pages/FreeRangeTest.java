package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class FreeRangeTest {

    private WebDriver driver;

    @BeforeMethod
    public void setUp()
    {
        driver = new ChromeDriver();
    }

    @Test
    public void test1(){
        driver.get("https://www.freerangetesters.com/");
        WebElement element = driver.findElement(By.id("idDelElemento"));
        element.click();
    }

    @Test
    public void test2(){
        driver.get("https://www.freerangetesters.com/");
        WebElement element = driver.findElement(By.id("idDelElemento"));
        element.click();
    }

    @Test
    public void test3(){
        driver.get("https://www.freerangetesters.com/");
        WebElement element = driver.findElement(By.id("idDelElemento"));
        element.click();
    }

    @AfterMethod
    public void tearDown()
    {
        if(driver != null) {
            driver.quit();
        }
    }

}
