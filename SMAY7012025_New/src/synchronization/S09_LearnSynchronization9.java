package synchronization;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
//Programe to understand StaleElementReferenceException is not ignored by explicit wait
public class S09_LearnSynchronization9 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://trello.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Wait wait = new WebDriverWait(driver, Duration.ofSeconds(10)).pollingEvery(Duration.ofMillis(200));
		
		WebElement loginBtn = driver.findElement(By.xpath("//a[text()='Log in' and @data-uuid]"));
		loginBtn.click();
		
		wait.until(ExpectedConditions.elementToBeClickable(loginBtn));
		
		System.out.println("Done");

	}

}
