package demo;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.HasFullPageScreenshot;

public class P2 {
	public static void main(String[] args) throws IOException {
		//Open Browser, Maximize it and Navigate to URL
//		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new FirefoxDriver(); 
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		HasFullPageScreenshot ts = (HasFullPageScreenshot) driver;
		
		File tempFile = ts.getFullPageScreenshotAs(OutputType.FILE);
		
		String timeStamp = LocalDateTime.now().toString().replace(':', '-');
		
		File destFile = new File("./errorshots/GooglForm"+timeStamp+".jpg");

		FileUtils.copyFile(tempFile, destFile);

		driver.quit();
	}
}
