/**
 * 
 */
package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * @author 04108E744 Create a new job listing
 */
public class Activity7 {

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
	public void ncreateNewJobListing() throws InterruptedException {

		// Locate the navigation menu and click the menu item that says “Post a Job”
		driver.findElement(By.xpath("//a[@href='https://alchemy.hguy.co/jobs/post-a-job/']")).click();

		// Click on sign in button
		driver.findElement(By.xpath("//a[@class='button']")).click();

		// Enter userID
		driver.findElement(By.xpath("//input[@id='user_login']")).sendKeys("root");

		// Enter Password
		driver.findElement(By.xpath("//input[@id='user_pass']")).sendKeys("pa$$w0rd");

		// Click on Login in button
		driver.findElement(By.xpath("//input[@id='wp-submit']")).click();

		// Enter Job title
		driver.findElement(By.xpath("//input[@id='job_title']")).sendKeys("Software Engineer");

		// Enter Location
		driver.findElement(By.xpath("//input[@id='job_location']")).sendKeys("India");

		// Select Job Type
		Select jobType = new Select(driver.findElement(By.xpath("//select[@id='job_type']")));
		jobType.selectByVisibleText("Freelance");
		Thread.sleep(1000);

		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='job_description_ifr']")));
		System.out.println("Switched to iframe===================");
		// Enter description
		driver.findElement(By.xpath("//body[@id='tinymce']")).sendKeys("Automation");

		driver.switchTo().defaultContent();

		driver.findElement(By.xpath("//input[@id='application']")).clear();
		driver.findElement(By.xpath("//input[@id='application']")).sendKeys("raji@cklabs.com");
		// Company details
		driver.findElement(By.xpath("//input[@id='company_name']")).clear();
		driver.findElement(By.xpath("//input[@id='company_name']")).sendKeys("IBM");
		driver.findElement(By.xpath("//input[@id='company_website']")).clear();
		driver.findElement(By.xpath("//input[@id='company_website']")).sendKeys("https://abcd");
		driver.findElement(By.xpath("//input[@id='company_tagline']")).clear();
		driver.findElement(By.xpath("//input[@id='company_tagline']")).sendKeys("It is service based company");
		// click on preview
		driver.findElement(By.xpath("//input[@name='submit_job']")).click();
		// Click submit listing
		driver.findElement(By.xpath("//input[@id='job_preview_submit_button']")).click();
		Thread.sleep(1000);
		// Click on job link
		driver.findElement(By.xpath("//a[@href='https://alchemy.hguy.co/jobs/jobs/']")).click();
		Thread.sleep(3000);

		String jobName = wait.until(
				ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//h3[text()='Software Engineer']"))))
				.getText();
		Assert.assertEquals(jobName, "Software Engineer");
	}

	@AfterMethod
	public void afterMethod() {
		// Close the browser
		driver.close();
	}

}
