package methodsUsedInNewVersion;

import org.openqa.selenium.firefox.FirefoxDriver;

public class S03_LaunchFireFoxBrowser {

	public static void main(String[] args) {
		//Open FireFox Browser
		FirefoxDriver driver = new FirefoxDriver();
		//Navigate to URL
		driver.get("https://www.google.com/");
	}

}
