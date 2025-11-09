package synchronization;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//implicit wait
public class S02_LearnSynchronization2 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.myntra.com/");

		driver.findElement(By.xpath("//input[contains(@placeholder,'Search for')]")).sendKeys("tshirt");

		List<WebElement> allTshitSuggetions = driver.findElements(By.xpath("//li[@class='desktop-suggestion null']"));

		for (WebElement ele : allTshitSuggetions) {
			System.out.println(ele.getText());
		}

		driver.quit();

	}

}
