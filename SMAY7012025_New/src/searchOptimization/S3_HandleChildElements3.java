package searchOptimization;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class S3_HandleChildElements3 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");

		WebElement parentTableTage = driver.findElement(By.name("BookTable"));

		List<WebElement> allTableHeaders = parentTableTage.findElements(By.tagName("th"));
		int eThCount = 4;
		int aThCount = allTableHeaders.size();

		System.out.println("Expected table header count: "+eThCount);
		System.out.println("Actual table header count: "+aThCount);
		if (eThCount == aThCount) {
			System.out.println("PASS:: Table Header count is correct");
			System.out.print("Table Headers: ");
			for (WebElement ele : allTableHeaders) {
				System.out.print(ele.getText()+" ");
			}
		}else {
			System.out.println("FAIL:: Table Header count is incorrect");
		}
		System.out.println();
		System.out.println("===========================================");

		List<WebElement> allTableRows = parentTableTage.findElements(By.tagName("tr"));
		int eTrCount = 7;
		int aTrCount = allTableRows.size();

		System.out.println("Expected table row count: "+eTrCount);
		System.out.println("Actual table row count: "+aTrCount);
		if (eTrCount == aTrCount) {
			System.out.println("PASS:: Table Row count is correct");
		}else {
			System.out.println("FAIL:: Table Row count is incorrect");
		}
		
		System.out.println("===========================================");

		List<WebElement> allTableData = parentTableTage.findElements(By.tagName("td"));
		int eTdCount = 24;
		int aTdCount = allTableData.size();

		System.out.println("Expected table data count: "+eTdCount);
		System.out.println("Actual table data count: "+aTdCount);
		if (eTdCount == aTdCount) {
			System.out.println("PASS:: Table data count is correct");
			for (WebElement ele : allTableData) {
				System.out.println(ele.getText());
			}
		}else {
			System.out.println("FAIL:: Table data count is incorrect");
		}

		driver.quit();
	}

}
