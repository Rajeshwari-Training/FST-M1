/**
 * 
 */
package SeleniumActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * @author 04108E744
 *
 */
public class Activity6_1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		 WebDriverWait wait = new WebDriverWait(driver, 15);
		driver.get("https://training-support.net/selenium/dynamic-controls");
		System.out.println("WebPage title: "+driver.getTitle());
		
		WebElement checkbox = driver.findElement(By.xpath("//div[@id='dynamicCheckbox']/input"));
		WebElement toggleButton = driver.findElement(By.xpath("//button[@id='toggleCheckbox']"));
		toggleButton.click();
		wait.until(ExpectedConditions.invisibilityOf(checkbox));
        //Click toggle button again
		toggleButton.click();
        wait.until(ExpectedConditions.visibilityOf(checkbox));
        checkbox.click();
        //Close browser
        driver.close();
		
		
		
	}
}
