package synchronization;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//explicit wait
public class S03_LearnSynchronization3 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://trello.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//a[text()='Log in' and @data-uuid]")).click();
		
		wait.until(ExpectedConditions.titleIs("Log in to continue - Log in with Atlassian account"));
		
		
		String actualTitle = driver.getTitle();
		
		String expectedTitle = "Log in to continue - Log in with Atlassian account";
		
		System.out.println("actualTitle: "+actualTitle);
		System.out.println("expectedTitle: "+expectedTitle);
		
		if (actualTitle.equals(expectedTitle)) {
			System.out.println("PASS:: title is correct");
		}else {
			System.out.println("FAIL:: Title is not correct");
		}
		
		driver.quit();

	}

}
