package synchronization;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;

public class SourceCodeContains implements ExpectedCondition<Boolean> {
	String expectedText;
	public SourceCodeContains(String expectedText) {
		this.expectedText = expectedText;
	}

	@Override
	public Boolean apply(WebDriver driver) {
		return driver.getPageSource().contains(expectedText);
	}
	
	@Override
	public String toString() {
		
		return expectedText+" But not received";
	}

}
