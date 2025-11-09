package synchronization;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class S13_LearnSynchronization13 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		try {
			wait.until(new MyCondition("vivek"));
			System.out.println("PASS: Custom condtion is satisfied");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("FAIL: Custom condition is not satisfied");
		}
		driver.quit();

	}
}
