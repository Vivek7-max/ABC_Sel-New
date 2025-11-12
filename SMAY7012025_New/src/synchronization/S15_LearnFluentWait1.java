package synchronization;

import java.time.Duration;
import java.util.function.Function;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;

public class S15_LearnFluentWait1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(10));
		
		
		try {
			wait.until(new Function<WebDriver, Boolean>(){
				String actualTitle;
				String expectedTitle = "oogle";
				public Boolean apply(WebDriver driver) {
					 actualTitle  = driver.getTitle();
					return actualTitle.equals(expectedTitle);
				}
			}
		);
			System.out.println("PASS:: Title found");
		} catch (Exception e) {
			System.out.println("FAIL:: Title not found");
		}
		
		
		
		driver.quit();

	}

}
