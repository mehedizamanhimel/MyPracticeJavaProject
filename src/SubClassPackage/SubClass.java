package SubClassPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class SubClass {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new SafariDriver();
	
		driver.get("https://demo.opencart.com/");
		
		Thread.sleep(10000);
		
		driver.quit();
	
	}

}
