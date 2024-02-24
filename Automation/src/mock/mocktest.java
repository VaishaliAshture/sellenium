package mock;

import java.awt.event.ActionEvent;
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

public class mocktest {

public static void main(String[] args) throws InterruptedException, IOException {
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get("https://www.reliancedigital.in/?gad_source=1&gclid=Cj0KCQiA2eKtBhDcARIsAEGTG43nD2teP7MJMC6n4PwL1fkZewWbXxWXWZQunBDctpwwNMeGERHwOq8aApgNEALw_wcB");
	
	WebElement home = driver.findElement(By.id("[id='RIL_HomeAppliancesNavigationNode']"));
	
	Actions act = new Actions(driver);
	act.moveToElement(home);
	
	driver.findElement(By.xpath("//a[text()='Refrigerators'][1]")).click();
	Thread.sleep(2000);	
	
	TakesScreenshot ts = (TakesScreenshot)driver;
	File src = ts.getScreenshotAs(OutputType.FILE);
	File dest = new File("./screenshot/reliance.png");
	Files.copy(src,dest);
	
	
	}	
}
