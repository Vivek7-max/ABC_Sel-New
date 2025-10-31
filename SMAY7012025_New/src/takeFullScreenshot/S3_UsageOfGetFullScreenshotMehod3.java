package takeFullScreenshot;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.HasFullPageScreenshot;

public class S3_UsageOfGetFullScreenshotMehod3 {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new FirefoxDriver();

		driver.manage().window().maximize();

		driver.get("https://testautomationpractice.blogspot.com/");

		HasFullPageScreenshot ts = (HasFullPageScreenshot) driver;//down casting

		File tempFile = ts.getFullPageScreenshotAs(OutputType.FILE);

		String timeStamp = LocalDateTime.now().toString().replace(':', '-');

		FileUtils.copyFile(tempFile, new File("./errorshots/FullPageSs"+timeStamp+".png"));

		driver.quit();

	}

}
