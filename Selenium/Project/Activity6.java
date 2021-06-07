/**
 * 
 */
package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * @author 04108E744 Apply to a job
 */
public class Activity6 {

	WebDriver driver;
	WebDriverWait wait;

	@BeforeMethod
	public void beforeMethod() {
		// Create a new instance of the Firefox driver
		driver = new FirefoxDriver();
		wait = new WebDriverWait(driver, 10);
		// Open browser
		driver.get("https://alchemy.hguy.co/jobs");
	}

	@Test
	public void applyToAJob() {

		// Click on Job link
		driver.findElement(By.xpath("//a[@href='https://alchemy.hguy.co/jobs/jobs/']")).click();

		driver.findElement(By.xpath("//input[@id='search_keywords']")).sendKeys("Banking");

		// Click on search button
		driver.findElement(By.xpath("//input[@value='Search Jobs']")).click();
		// Wait till list appears
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@class='job_listings']")));

		// Click and open any one of the jobs listed.
		driver.findElement(By.xpath("//ul[@class='job_listings']/li[1]/a")).click();

		// Click the apply button and print the email to the console.
		driver.findElement(By.xpath("//input[@class='application_button button']")).click();

		// Click the apply button and print the email to the console
		System.out.println(
				"Email address :" + driver.findElement(By.xpath("//a[@class='job_application_email']")).getText());

	}

	@AfterMethod
	public void afterMethod() {
		// Close the browser
		driver.quit();
	}

}
