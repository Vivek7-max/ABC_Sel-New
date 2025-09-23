package methodsUsedInNewVersion;

import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class S04_UsageOfWindowMethod {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		Window window = driver.manage().window();
		
		window.maximize();
		Thread.sleep(3000);
		
		window.minimize();
		Thread.sleep(3000);
		
		window.fullscreen();
		Thread.sleep(3000);
		
		driver.quit();
	}

}
