package synchronization;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.naming.directory.NoSuchAttributeException;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.NoSuchSessionException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class S11_LearnSynchronization11 {
//Program to understand how we can ignore the exception in the explicit wait
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://trello.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		wait.ignoring(NoSuchElementException.class); //To ignore the single exception 
		
//		wait.ignoring(NoSuchFrameException.class, NoSuchAttributeException.class); To ignore the two exceptions
		
//		Collection list = new ArrayList();
//		list.add(NoSuchElementException.class);
//		list.add(NoSuchFrameException.class);
//		list.add(NoSuchSessionException.class);
//		
//		wait.ignoreAll(list);  //To ignore the collection of exception
		
		WebElement loginBtn = driver.findElement(By.xpath("//a[text()='Log in' and @data-uuid]"));
		loginBtn.click();
		
		wait.until(ExpectedConditions.elementToBeClickable(loginBtn));
		
		System.out.println("Done");

	}

}
