package searchOptimization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class S1_HandleChildElements1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://en-gb.facebook.com/login/");
		
		WebElement loginForm = driver.findElement(By.id("login_form"));
		
		//Optimizing the search criteria
		loginForm.findElement(By.id("email")).sendKeys("Sheela@gmail.com");
		loginForm.findElement(By.id("pass")).sendKeys("Sheela@123");
		loginForm.findElement(By.id("loginbutton")).click();
		
		String exptectedTitle = "Facebook";
		wait.until(ExpectedConditions.titleIs(exptectedTitle));
		
		String actualTitle = driver.getTitle();
		
		System.out.println("exptectedTitle: "+exptectedTitle);
		System.out.println("actualTitle: "+actualTitle);
		
		
		if(actualTitle.equals(exptectedTitle)) {
			System.out.println("PASS:: Title is Correct after login");
		}else {
			System.out.println("FAIL:: Title is incorrect after login");
		}
		
		driver.quit();
	}

}
