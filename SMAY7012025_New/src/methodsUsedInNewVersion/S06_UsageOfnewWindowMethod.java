package methodsUsedInNewVersion;

import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class S06_UsageOfnewWindowMethod {
//To Open the new Tab And Navigate to URL
	public static void main(String[] args) throws InterruptedException {
		//Launch Browser
		ChromeDriver driver = new ChromeDriver();
		//Maximize the Browser
		driver.manage().window().maximize();
		//Navigate to URL
		driver.get("https://the-internet.herokuapp.com/windows");
		
		//open New TAB 
		driver.switchTo().newWindow(WindowType.TAB);
		//newWindow() => parameterized method accepts WindowType Enum 
		//It is used to open the new TAB / Window
		//Once the new TAB / Window open, control will be present in newly opened TAB / Window
		
		//Navigate to google URL
		driver.get("https://www.google.com");
		
		Thread.sleep(2000);
		//Close the browser and stop the server
		driver.quit();
		
	}

}
