package synchronization;

import java.time.Duration;
import java.util.function.Function;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;

public class S16_LearnFluentWait2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(10));
		
		
		try {
			wait.until(new Function<WebDriver, WebElement>() {
				public WebElement apply(WebDriver driver) {
					WebElement ele = driver.findElement(By.name("ername"));
					if(ele.isDisplayed()) {
						return ele;
					}else {
						return null;
					}
				}
			});
			
			System.out.println("PASS:: Element is displayed");
		} catch (Exception e) {
			System.out.println("FAIL:: Element is not displayed");
		}
		
		
		
		driver.quit();
		

	}

}
