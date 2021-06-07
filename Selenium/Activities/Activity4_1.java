/**
 * 
 */
package SeleniumActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author 04108E744
 *
 */
public class Activity4_1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver =  new FirefoxDriver();
		driver.get("https://www.training-support.net");
		System.out.println("WebPage title: "+driver.getTitle());
		driver.findElement(By.xpath("//a[@id,'about-link']")).click();
		System.out.println("About us title: "+driver.getTitle());
		driver.close();
		
	}

}
