package synchronization;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import org.openqa.selenium.By;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.NoSuchSessionException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//Program to ignore the  NoSuchSessionException
public class S12_LearnSynchronization12 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://trello.com/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		Collection<Class<? extends Exception>> list = new ArrayList();
		list.add(StaleElementReferenceException.class);
		list.add(NoSuchSessionException.class);
		list.add(InvalidArgumentException.class);
		
		wait.ignoreAll(list);

		WebElement loginBtn = driver.findElement(By.xpath("//a[text()='Log in' and @data-uuid]"));
		loginBtn.click();
		
		driver.quit();

		wait.until(ExpectedConditions.elementToBeClickable(loginBtn));
		
	}

}
