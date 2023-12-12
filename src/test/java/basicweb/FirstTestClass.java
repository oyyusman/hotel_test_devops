package basicweb;
import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
public class FirstTestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

//        WebDriverWait wait = new WebDriverWait(driver,15); // 10 seconds timeout

        driver.get("http://localhost/Hotel-Management-System-main/index.php");
//        WebElement empEmailElement = wait.until(ExpectedConditions.elementToBeClickable(By.name("Emp_Email")));


        
        WebElement Empl_email = driver.findElement(By.name("Emp_Email"));
        
        Empl_email.sendKeys("Admin@gmail.com");
        
        WebElement Empl_password = driver.findElement(By.name("Emp_Password"));
        Empl_password.sendKeys("1234");
        
        driver.findElement(By.name("Emp_login_submit")).click();
        String expected_title= "BlueBird - Admin";
        String actual_title=driver.getTitle();
        
        if(expected_title.equals(actual_title)) {
        	System.out.println("login successfully");
        }
        else {
        	System.out.println("login failed");
        }
	}

}
