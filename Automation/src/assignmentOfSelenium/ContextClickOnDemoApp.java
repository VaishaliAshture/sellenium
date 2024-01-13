package assignmentOfSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClickOnDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 WebDriver driver = new FirefoxDriver();
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
			driver.get("https://demoapps.qspiders.com/button/buttonRightClick?sublist=1");
		// create the object of actions class
		
		Actions act = new Actions(driver);
		
		// use context click method to right click on button
		act.contextClick(driver.findElement(By.id("btn30"))).perform();
		// to click on yes button
		act.contextClick(driver.findElement(By.xpath("//div[text()='Yes']"))).click().perform();
		
		// click on 2nd right click button
		act.contextClick(driver.findElement(By.id("btn31"))).perform();
		// to click on yes button
		driver.findElement(By.xpath("//div[text()='Yes']")).click();
		
		act.contextClick(driver.findElement(By.id("btn32"))).perform();
		
		
		act.contextClick(driver.findElement(By.xpath("//div[text()='Yes']"))).click().perform();
		
	}

}
