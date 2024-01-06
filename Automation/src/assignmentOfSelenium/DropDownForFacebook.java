package assignmentOfSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownForFacebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
   WebDriver driver = new ChromeDriver();
   
   driver.manage().window().maximize();
   
   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
   
   driver.get("https://www.facebook.com/");
   
   driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
   
   driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Vaishali");
   
   driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Sategaye");
   
   driver.findElement(By.xpath("//input[@aria-label='Mobile number or email address']")).sendKeys("6789543210");
   
   driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("@M10");
   
   WebElement day = driver.findElement(By.id("day"));    
   
   Select d = new Select(day);
   
   d.selectByIndex(5);
   
   WebElement month = driver.findElement(By.id("month"));    
   
   Select m = new Select(month);
   
   m.selectByValue("2");
   
 WebElement year = driver.findElement(By.id("year"));    
   
   Select y = new Select(year);
   
   y.selectByVisibleText("2021");
   
   driver.findElement(By.name("sex")).click(); 
   
   driver.findElement(By.xpath("//button[@name='websubmit']")).click();
   
   
   
	}
}
