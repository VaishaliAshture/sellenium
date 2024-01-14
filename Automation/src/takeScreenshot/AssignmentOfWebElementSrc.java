package takeScreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class AssignmentOfWebElementSrc {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		  WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
			driver.get("https://www.bluestone.com/");
			
			driver.findElement(By.id("denyBtn")).click();
			
			// to get location of coins web element
			WebElement coin = driver.findElement(By.xpath("//a[@title='Coins']"));
			
			//to perform mouse actions
			Actions act = new Actions(driver);
			
			act.moveToElement(coin).perform();
			
			//to get the location of design of coins
			driver.findElement(By.xpath("//span[text()='Coins by Design']")).click();
			
			// to identify particular web element
	      WebElement gold	= driver.findElement(By.xpath("//img[@alt='50 gram 24 KT Lakshmi Gold Coin']"));
			
		// to take screenShot of web element call getscreenShotas method
		  File src = gold.getScreenshotAs(OutputType.FILE);
			   
		   File dest = new File("./screenshot/gold.png");
			  
		   Files.copy(src, dest);
			   

	}

}
