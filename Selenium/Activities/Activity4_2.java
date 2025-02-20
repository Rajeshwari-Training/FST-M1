/**
 * 
 */
package SeleniumActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author 04108E744
 *
 */
public class Activity4_2 {
    public static void main(String[] args) throws InterruptedException {
        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        //Open the browser
        driver.get("https://www.training-support.net/selenium/simple-form");

        //Find the page title and print it
        String pageTitle = driver.getTitle();
        System.out.println(pageTitle);

        //Find the input fields and enter text
        WebElement firstName = driver.findElement(By.xpath("//input[@id = 'firstName']"));
        WebElement lastName = driver.findElement(By.xpath("//input[@id = 'lastName']"));
        firstName.sendKeys("Raji");
        lastName.sendKeys("Srinivas");
        Thread.sleep(1000);
        //Enter the email
        driver.findElement(By.xpath("//input[@id = 'email']")).sendKeys("test@example.com");
        Thread.sleep(1000);
        //Enter the contact number
        driver.findElement(By.xpath("//input[@id = 'number']")).sendKeys("1234567890");
        Thread.sleep(1000);
        //Enter Message
        driver.findElement(By.xpath("//textarea")).sendKeys("This is my message");
        Thread.sleep(1000);
        //Click Submit
        driver.findElement(By.xpath("//input[contains(@class, 'green')]")).click();
        driver.close();
    }
}
