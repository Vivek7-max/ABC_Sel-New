package methodsUsedInNewVersion;

import org.openqa.selenium.edge.EdgeDriver;

public class S02_LaunchEdgeBrowserAndNAvigateToURL {

	public static void main(String[] args) {
		//Open Edge Browser
		EdgeDriver driver = new EdgeDriver();
		//Navigate to URL
		driver.get("https://www.google.com/");

	}

}
