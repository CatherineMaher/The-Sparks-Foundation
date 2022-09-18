package demo;

import static org.junit.Assert.*;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class LoginTest {

	String path = "E:/Software Testing/SeleniumLab/SeleniumLab/";
    	
    @Test
    public void Test1() throws Exception {
    	
        // Set Firefox Web Driver
        System.setProperty("webdriver.gecko.driver", path + "geckodriver.exe");
    	WebDriver driver = new FirefoxDriver();

        // Puts an Implicit wait, Will wait for 4 seconds before throwing exception
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      
        // Launch website
        driver.navigate().to("https://www.thesparksfoundationsingapore.org/");
        // Maximize the browser
        driver.manage().window().maximize();
        
        
        ///////////////////////////////////////////////////////////////////////////////////////////////////
        
        //FIRST PAGE 
        
        //Test About us
        driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/nav/div[2]/nav/ul/li[1]/a")).click();
        //Test news
        driver.findElement(By.xpath("//*[@id=\"link-effect-3\"]/ul/li[1]/ul/li[7]/a")).click();
        
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
       
        // test element1 (Vision,Mission and values)
        assertEquals(true, driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/ul/li[1]")).isDisplayed());
        // test element2 (@twitter)
        assertEquals(true, driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div[3]/div[1]/h3/span")).isDisplayed());
        
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        /////////////////////////////////////////////////////////////////////////////////////////////////
        
        //SECOND PAGE 
        
        //test policies and code
        driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/nav/div[2]/nav/ul/li[2]/a")).click();
        //test code of ethics and conduct 
        driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/nav/div[2]/nav/ul/li[2]/ul/li[2]/a")).click();
        
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        
        //Test element3 (TSF title)
        assertEquals(true, driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div[1]/div/div/h4")).isDisplayed());
        //test element4 (service quality values)
        assertEquals(true, driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/ul/li[5]/a")).isDisplayed());
        
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        //////////////////////////////////////////////////////////////////////////////////////////////////
        
        //THIRD PAGE
        
        //test programs
        driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/nav/div[2]/nav/ul/li[3]/a")).click();
        //test  workshops
        driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/nav/div[2]/nav/ul/li[3]/ul/li[4]/a")).click();
        
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        
        //Test element5 (links app title)
        assertEquals(true, driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div[1]/div/div/div/div[2]/div/h4/a")).isDisplayed());
        //test element6 (workshops right tab)
        assertEquals(true, driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/ul/li[4]/a")).isDisplayed());
        
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        /////////////////////////////////////////////////////////////////////////////////////////////////////
        
        //FOURTH PAGE
        
        //test links
        driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/nav/div[2]/nav/ul/li[4]/a")).click();
        //test  Ai in education
        driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/nav/div[2]/nav/ul/li[4]/ul/li[3]/a")).click();
        
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        
        //Test element7 (1st title)
        assertEquals(true, driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div[1]/div/div/div[1]/div/h4/a")).isDisplayed());
        //test element8 (2nd title)
        assertEquals(true, driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div[1]/div/div/div[2]/div/h4/a")).isDisplayed());
        
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        /////////////////////////////////////////////////////////////////////////////////////////////////////
        
        //FIFTH PAGE
        
        //test join us 
        driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/nav/div[2]/nav/ul/li[5]/a")).click();
        //test  why join us 
        driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/nav/div[2]/nav/ul/li[5]/ul/li[1]/a")).click();
        
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        
        //Test element9 (benefits)
        assertEquals(true, driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div[3]/div[1]/div/h4")).isDisplayed());
        //test element10 (How)
        assertEquals(true, driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div[3]/div[2]/div/h4")).isDisplayed());
        
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        /////////////////////////////////////////////////////////////////////////////////////////////////////
        
        
        Thread.sleep(3000);
       	driver.close();
    }
    
 
      

}
