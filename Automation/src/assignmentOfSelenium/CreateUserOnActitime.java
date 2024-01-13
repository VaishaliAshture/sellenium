package assignmentOfSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateUserOnActitime {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		// launch web application
		driver.get("http://madhav/login.do");
		// enter username
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		// enter pwd
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		// click on login button
		driver.findElement(By.xpath("//a[@class='initial']")).click();
		
		
		// click on users tab
		driver.findElement(By.xpath("//a[@class='content users']")).click();
		
		
		Thread.sleep(2000);
		//click on create new users button
		driver.findElement(By.xpath("//input[@value='Create New User']")).click();
		// to fill username
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("vaishali");
		
		// to perform dropdown
		WebElement dropdown = driver.findElement(By.name("active"));
		Select opt = new Select(dropdown);
		opt.selectByIndex(0);
		// to fill pwd
		driver.findElement(By.xpath("//input[@name='passwordText']")).sendKeys("v12");
		
		//to fill retype pwd
		driver.findElement(By.xpath("//input[@name='passwordTextRetype']")).sendKeys("v12");
		//to fill first name
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Kirti");
		// to fill last name
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Ashture");
		
		// to fill work duration
		 WebElement wrd = driver.findElement(By.xpath("//input[@name='workdayDurationStr']"));
		
		 wrd.clear();
		 wrd.sendKeys("9:00");
		
		// to select check box
		driver.findElement(By.xpath("//input[@name='overtimeTracking']")).click();
		// to select radio button
		driver.findElement(By.xpath("//input[@id='overtimeTrackingLevel_Hidden']")).click();
		// to fill hire date
		driver.findElement(By.xpath("//input[@id='hireDateId']"));
		
		Thread.sleep(2000);
		// to click on calendar
		driver.findElement(By.xpath("//img[@id='ext-gen7']")).click();
		Thread.sleep(2000);
		//to click on date
		driver.findElement(By.xpath("//span[text()='19']")).click();
		Thread.sleep(2000);
		//to click on create button
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		
		
		
		
		
		
		
		
		
		
		


	}

}
