package assignmentOfSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoAppsQspider {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoapps.qspiders.com/formValidation?sublist=0");
			
		
		driver.findElement(By.xpath("//input[@name='requiredfield']")).sendKeys("Chabbu");
		
		driver.findElement(By.name("password")).sendKeys("A@12");
		
		driver.findElement(By.name("confirmpass")).sendKeys("A@12");
		
		driver.findElement(By.name("email")).sendKeys("ashture@gmail.com");
		
		driver.findElement(By.name("url")).sendKeys("https://www.flipkart.com");
		
		driver.findElement(By.name("digits")).sendKeys("23");
		
		driver.findElement(By.xpath("//input[@placeholder='Enter only numbers']")).sendKeys("2345");
		
        driver.findElement(By.xpath("//input[@placeholder='Enter alphanumeric value']")).sendKeys("abc44");
        
     
        
        driver.findElement(By.xpath("//input[@placeholder='Min 6 chars.']")).sendKeys("kirti");
      
        driver.findElement(By.name("maxLength")).sendKeys("Ashture");
        
        driver.findElement(By.name("rangeLength")).sendKeys("Ashture");
        
        driver.findElement(By.name("minValue")).sendKeys("8");
        
        Thread.sleep(2000);
        
        driver.findElement(By.name("//input[@placeholder='Max value is 6']")).sendKeys("6");
        
        driver.findElement(By.name("rangeValue")).sendKeys("10");
        
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//button[text()='Submit']")).click();
        
	}

}
