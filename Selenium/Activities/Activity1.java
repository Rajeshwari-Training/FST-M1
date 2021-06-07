/**
 * 
 */
package SeleniumActivities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author 04108E744
 *
 */
public class Activity1 {
	
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net");
		driver.close();
	}
	

}
