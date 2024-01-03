package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByRelationalOperator {
	public static void main(String[] args) throws InterruptedException {
		 
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//span[text()='✕']")).click();

		
		driver.findElement(By.xpath("//img[@class='_2puWtW _3a3qyb' and  @alt='Fashion']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Login")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@type='text' and @class='_2IX_2- VJZDxU']")).sendKeys("vaishali@123");
	}

}
