
package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * @author 04108E744 Login into the website’s backend
 */
public class Activity8 {

	WebDriver driver;
	WebDriverWait wait;

	@BeforeMethod
	public void beforeMethod() {
		// Create a new instance of the Firefox driver
		driver = new FirefoxDriver();
		wait = new WebDriverWait(driver, 10);
		// Open browser
		driver.get("https://alchemy.hguy.co/jobs/wp-admin");
	}

	@Test
	public void websiteFromBackend() {

		// Enter userID
		driver.findElement(By.xpath("//input[@id='user_login']")).sendKeys("root");

		// Enter Password
		driver.findElement(By.xpath("//input[@id='user_pass']")).sendKeys("pa$$w0rd");

		// Click on Login in button
		driver.findElement(By.xpath("//input[@id='wp-submit']")).click();

		// Verify that you have logged in.
		String webPageHeading = driver.findElement(By.xpath("//div[@id='wpbody-content']/div/h1")).getText();

		System.out.println("Webpage heading is : " + webPageHeading);
		// Assertion for page title
		Assert.assertEquals("Dashboard", webPageHeading);
	}

	@AfterMethod
	public void afterMethod() {
		// Close the browser
		driver.quit();
	}

}
