package javaScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//program to understand how to execute the java script using executeScipt method of JavaScriptExecutor 
public class S1_LearnJavaScript1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		//1. Downcast the WebDriver reference to JavaScriptExecutor interface
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		
		//2. use execute script method of JavaScriptExecutor interface & pass the 
		//   javaScript code as argument 
		
		jse.executeScript("window.alert(\"Happy New Year..!!\");");
	}

}
