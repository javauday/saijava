package login;


import org.openqa.selenium.By; 
 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement; 
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.chrome.ChromeDriver; 
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.List;
import org.openqa.selenium.firefox.*;
import java.util.concurrent.*;
 
public class chrome {
     
    public static void main(String[] args) {
         
    	
    	
        //initialize Chrome driver
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win\\chromedriver.exe"); 
        
         WebDriver driver = new ChromeDriver(); 
         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
          
         //Open gmail
         driver.get("http://mail.google.com");
          
         // Enter userd id
         WebElement element = driver.findElement(By.id("Email"));
         element.sendKeys("amulyareddy220@gmail.com");
          
         //wait 5 secs for  userid to be entered
         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
         driver.findElement(By.id("next")).click();
          
         //Enter Password
         WebElement element1 = driver.findElement(By.id("Passwd"));
         element1.sendKeys("qatesting");
          
         //Submit button
         element.submit();
          
          
         WebElement myDynamicElement = (new WebDriverWait(driver, 15)).until(ExpectedConditions.presenceOfElementLocated(By.id("gbg4")));
         driver.findElement(By.id("gbg4")).click();
          
         //press signout button
 driver.findElement(By.id("gb_71")).click();   
          
          
    }
     
     
 
}
