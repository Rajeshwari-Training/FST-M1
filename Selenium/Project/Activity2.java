/**
 * 
 */
package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * @author 04108E744
 *
 * Verify the website heading
 */
public class Activity2 {

	WebDriver driver;

	@BeforeMethod
	public void beforeMethod() {
		// Create a new instance of the Firefox driver
		driver = new FirefoxDriver();

		// Open browser
		driver.get("https://alchemy.hguy.co/jobs");
	}

	@Test
	public void verifyWebsiteHeading() {

		String webPageHeading = driver.findElement(By.xpath("//h1[@class='entry-title']")).getText();

		System.out.println("Webpage heading is : " + webPageHeading);

		// Assertion for page title
		Assert.assertEquals("Welcome to Alchemy Jobs", webPageHeading);

	}

	@AfterMethod
	public void afterMethod() {
		// Close the browser
		driver.quit();
	}

}
