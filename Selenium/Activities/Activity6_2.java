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
public class Activity6_2 {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		driver.get("https://training-support.net/selenium/ajax");
		System.out.println("WebPage title: "+driver.getTitle());
		WebElement changeContentBtn = driver.findElement(By.xpath("//button[@class='ui violet button']"));
		changeContentBtn.click();
        //Wait for text to load
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("ajax-content"), "HELLO!"));
		System.out.println("Text on Page"+ driver.findElement(By.id("ajax-content")).getText());
		
        //Wait for late text
		
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("ajax-content"), "I'm late!"));
        //Get late text and print it
	
        String lateText = driver.findElement(By.id("ajax-content")).getText();
	
        System.out.println(lateText);
        //Close browser
	
        driver.close();
		
	}

}
