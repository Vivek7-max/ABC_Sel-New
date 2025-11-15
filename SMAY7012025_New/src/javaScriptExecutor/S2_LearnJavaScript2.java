package javaScriptExecutor;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class S2_LearnJavaScript2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.dassault-aviation.com/en/");
		
		WebElement companyHistoryLink = driver.findElement(By.linkText("Company History"));
//		companyHistoryLink.click();
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		
		jse.executeScript("arguments[0].click();", companyHistoryLink);
		
		String expectedTitle = "Dassault Aviation History";
		String actualTitle = driver.getTitle();
		
		System.out.println("expectedTitle: "+expectedTitle);
		System.out.println("actualTitle: "+actualTitle);
		
		if (actualTitle.equals(expectedTitle)) {
			System.out.println("PASS:: Title is correct");
		}else {
			System.out.println("FAIL:: Title is incorrect");
		}
		
		driver.quit();
	}

}
