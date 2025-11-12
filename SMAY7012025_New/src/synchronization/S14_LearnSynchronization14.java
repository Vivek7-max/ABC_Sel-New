package synchronization;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class S14_LearnSynchronization14 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		try {
			wait.until(new SourceCodeContains("Narndra Modi"));
			System.out.println("PASS::Expected text is present in the source code");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("FAIL:: Expected text is not present in the source code");
		}
		
		driver.quit();	
	}
}
