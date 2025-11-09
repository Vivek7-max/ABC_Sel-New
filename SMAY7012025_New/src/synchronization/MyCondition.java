package synchronization;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;

public class MyCondition implements ExpectedCondition<Boolean> {
	String expectedTitle;
	String actualTitle;
	
	public MyCondition(String expectedTitle) {
		this.expectedTitle = expectedTitle;
	}

	@Override
	public Boolean apply(WebDriver driver) {
		 actualTitle = driver.getTitle();
		return actualTitle.equals(expectedTitle);
	}
	
	@Override
	public String toString() {
		return expectedTitle+". but got "+actualTitle;
	}

}
