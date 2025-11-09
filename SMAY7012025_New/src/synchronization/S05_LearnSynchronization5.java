package synchronization;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
//Program to change the polling period of explicit wait
public class S05_LearnSynchronization5 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://trello.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
//		wait.pollingEvery(Duration.ofSeconds(1));
		wait.pollingEvery(Duration.ofMillis(200));
		
		driver.findElement(By.xpath("//a[text()='Log in' and @data-uuid]")).click();
		
		wait.until(ExpectedConditions.titleIs("Vivek"));
		
		System.out.println("Done");
	}

}
