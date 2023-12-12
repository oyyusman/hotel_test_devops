package basicweb;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FifthTestClass {
    public static void main(String[] args) {
        // Set up Chrome to disable the download prompt
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        options.addArguments("--disable-popup-blocking");
        options.addArguments("test-type");
        options.addArguments("disable-infobars");
        options.setExperimentalOption("prefs", downloadPreferences());

        // Create a new instance of the ChromeDriver with options
        WebDriver driver = new ChromeDriver(options);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

        // Navigate to your web page
        driver.get("http://localhost/Hotel-Management-System-main/index.php");

        try {
            // Find and click the exportexcel button
            WebElement exportExcelButton = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("exportexcel")));
            exportExcelButton.click();

            Thread.sleep(5000); // Wait for 5 seconds (adjust as needed)
            // Example: Assert that the file exists in a specified directory
            // Replace "path/to/download/directory" and "example.xlsx" with your actual directory and file name
            String filePath = "C:\\Users\\usman\\Downloads\\bluebird_roombook_data_20231207.xls";
            java.io.File file = new java.io.File(filePath);
            if (file.exists()) {
                System.out.println("File downloaded successfully.");
            } else {
                System.out.println("File download failed.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            if (driver != null) {
                driver.quit();
            }
        }
    }

    private static java.util.HashMap<String, Object> downloadPreferences() {
        java.util.HashMap<String, Object> chromePrefs = new java.util.HashMap<>();
        chromePrefs.put("profile.default_content_settings.popups", 0);
        chromePrefs.put("C:\\Users\\usman\\Downloads", "C:\\Users\\usman\\Downloads\\bluebird_roombook_data_20231207.xls");
        return chromePrefs;
    }
}


	


