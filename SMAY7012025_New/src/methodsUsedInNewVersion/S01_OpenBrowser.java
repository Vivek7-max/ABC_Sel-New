package methodsUsedInNewVersion;

import org.openqa.selenium.chrome.ChromeDriver;

public class S01_OpenBrowser {

	public static void main(String[] args) {
		//Open Browser
		ChromeDriver driver = new ChromeDriver();
		//In the new version of Selenium it is not required to set the driver executable path
		//It is used to launch the empty browser
		//Browser will be launched according to the driver specific type of class
	}

}
