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
 * Verify the website’s second heading
 */
public class Activity4 {

	WebDriver driver;

	@BeforeMethod
	public void beforeMethod() {
		// Create a new instance of the Firefox driver
		driver = new FirefoxDriver();

		// Open browser
		driver.get("https://alchemy.hguy.co/jobs");
	}

	@Test
	public void verifyWebsiteSecondHeading() {

		String webPageHeading = driver.findElement(By.xpath("/html/body/div/div/div/div/main/article/div/h2"))
				.getText();

		System.out.println("Webpage heading is : " + webPageHeading);

		// Assertion for page title
		Assert.assertEquals("Quia quis non", webPageHeading);

	}

	@AfterMethod
	public void afterMethod() {
		// Close the browser
		driver.quit();
	}

}
