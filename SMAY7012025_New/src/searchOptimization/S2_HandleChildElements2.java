package searchOptimization;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class S2_HandleChildElements2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://www.dassault-aviation.com/");
		WebElement parentUl = driver.findElement(By.id("menu-main-menu"));

		parentUl.findElement(By.xpath("//span[text()='Group']")).click();
		String eUrl1 = "https://www.dassault-aviation.com/en/group/";
		String aUrl1 = driver.getCurrentUrl();
		verifyUrl(eUrl1, aUrl1);

//		parentUl.findElement(By.xpath("//span[text()='Defense']")).click();
//		eUrl1 = "https://www.dassault-aviation.com/en/defense/";
//		aUrl1 = driver.getCurrentUrl();
//		verifyUrl(eUrl1, aUrl1);
//
//		parentUl.findElement(By.xpath("//span[text()='Civil']")).click();
//		eUrl1 = "https://www.dassault-aviation.com/en/civil/";
//		aUrl1 = driver.getCurrentUrl();
//		verifyUrl(eUrl1, aUrl1);
//		
//		parentUl.findElement(By.xpath("//span[text()='Space']")).click();
//		eUrl1 = "https://www.dassault-aviation.com/en/space/";
//		aUrl1 = driver.getCurrentUrl();
//		verifyUrl(eUrl1, aUrl1);
//		
		driver.quit();

	}

	public static void verifyUrl(String eUrl, String aUrl) {
		if(aUrl.equals(eUrl)) {
			System.out.println("PASS");
		}else {
			System.out.println("FAIL");
		}
	}


}
