package basicweb;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class ThirdTestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
        driver.get("http://localhost/Hotel-Management-System-main/index.php");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(90));
        
        	WebElement delete_name = driver.findElement(By.className("btn-primary"));
        	delete_name.click();
        	
        	String expected_title= "Hotel blue bird";
            String actual_title=driver.getTitle();
            if(expected_title.equals(actual_title)) {
            	System.out.println("logout successfully");
            }
            else {
            	System.out.println("logout failed");
            }
            
            
        
            
        
        



	}
	

}
