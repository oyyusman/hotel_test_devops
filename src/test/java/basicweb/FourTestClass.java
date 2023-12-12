package basicweb;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FourTestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
        driver.get("http://localhost/Hotel-Management-System-main/index.php");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(80));
        WebElement print_name = driver.findElement(By.className("btn-primary"));
    	print_name.click();
    	
    	String expected_title= "BlueBird -Admin print";
        String actual_title=driver.getTitle();
        if(expected_title.equals(actual_title)) {
        	System.out.println("printed successfully");
        }
        else {
        	System.out.println("not successfully");
        }

    	


	}

}
