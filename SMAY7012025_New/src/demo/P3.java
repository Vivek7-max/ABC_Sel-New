package demo;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class P3 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		for(int i=1;i<=100;i++) {
			
			try {
				driver.findElement(By.xpath("//button[@type='submit']")).click();
				System.out.println("Try Count= "+i);
				break;
			} catch (Exception e) {
				
			}
		}
		
		
		
//		driver.quit();
	}
}
