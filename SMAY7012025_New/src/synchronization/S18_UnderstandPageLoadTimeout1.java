package synchronization;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class S18_UnderstandPageLoadTimeout1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(2));
		
		try {
			driver.get("https://trello.com/");
			System.out.println("PASS:: Application is loaded within 2 seconds");
		} catch (Exception e) {
			System.out.println("FAIL:: Application is not loaded within 2 seconds");
		}
	
		driver.quit();
		
	}

}
