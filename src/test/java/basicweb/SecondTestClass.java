package basicweb;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;


public class SecondTestClass {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
        driver.get("http://localhost/Hotel-Management-System-main/home.php");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(70));
        WebElement g_name = driver.findElement(By.xpath("//input[@name='Name']"));
        g_name.sendKeys("usman");
        
        WebElement g_mail = driver.findElement(By.name("Email"));
        g_mail.sendKeys("usman@gmail.com");
        
        WebElement countryDropdown = driver.findElement(By.name("Country"));

        // Create a Select object to interact with the dropdown
        Select countrySelect = new Select(countryDropdown);
        countrySelect.selectByVisibleText("Australia");
        
        WebElement g_phone = driver.findElement(By.name("Phone"));
        g_phone.sendKeys("123456789");
        
        WebElement RoomDropdown = driver.findElement(By.name("RoomType"));

        // Create a Select object to interact with the dropdown
        Select roomSelect = new Select(RoomDropdown);
        roomSelect.selectByVisibleText("SUPERIOR ROOM");
        
        WebElement BedDropdown = driver.findElement(By.name("Bed"));

        // Create a Select object to interact with the dropdown
        Select bedSelect = new Select(BedDropdown);
        bedSelect.selectByVisibleText("Double");
        
        WebElement noRoomDropdown = driver.findElement(By.name("NoofRoom"));

        // Create a Select object to interact with the dropdown
        Select noroomSelect = new Select(noRoomDropdown);
        noroomSelect.selectByVisibleText("1");
        
        WebElement MealDropdown = driver.findElement(By.name("Meal"));

        // Create a Select object to interact with the dropdown
        Select MealSelect = new Select(MealDropdown);
        MealSelect.selectByVisibleText("Breakfast");
        
        WebElement cin = driver.findElement(By.name("cin"));
        cin.sendKeys("12/12/2023");
        
        WebElement cout = driver.findElement(By.name("cout"));
        cout.sendKeys("16/12/2023");
        
        driver.findElement(By.name("guestdetailsubmit")).click();
      // Check the content of the message
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement confirmationModal = wait.until(ExpectedConditions.presenceOfElementLocated(By.className("swal-modal")));

        WebElement confirmationTitle = confirmationModal.findElement(By.className("swal-title"));
        String message = confirmationTitle.getText();
        if (message.contains("Reservation successful")) {
            System.out.println("Room booked successfully!");

        } else {
            System.out.println("Room booking failed: " + message);

        }

        
        
        
        
        
        
        
        
        
        
        


        
        
        
		

	}

}
