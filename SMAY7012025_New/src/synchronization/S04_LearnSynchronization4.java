package synchronization;

import java.time.Duration;
import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class S04_LearnSynchronization4 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/login");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("userName")).sendKeys("testuser");
		driver.findElement(By.id("password")).sendKeys("Test@1234");
		driver.findElement(By.id("login")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		wait.until(ExpectedConditions.urlContains("profile"));
		
		String actualUrl = driver.getCurrentUrl();
		
		String expectedUrl = "https://demoqa.com/profile";
		
		System.out.println("actualUrl: "+actualUrl);
		System.out.println("expectedUrl: "+expectedUrl);
		
		
		if(actualUrl.equals(expectedUrl)) {
			System.out.println("PASS:: URL is correct");
		}else {
			System.out.println("FAIL:: URL is not correct");
		}
		
		driver.quit();
		
	}

}
