package synchronization;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S19_UnderstandPageLoadTimeout2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//implicit wait and pageLoadTimeout can be called in single instruction
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0)).pageLoadTimeout(Duration.ofSeconds(10));
		
		try {
			driver.get("https://trello.com/");
			System.out.println("PASS:: Application is loaded within 2 seconds");
		} catch (Exception e) {
			System.out.println("FAIL:: Application is not loaded within 2 seconds");
		}
	
		driver.quit();

	}

}
