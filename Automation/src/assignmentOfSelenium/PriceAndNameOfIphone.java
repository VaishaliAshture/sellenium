package assignmentOfSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PriceAndNameOfIphone {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
         WebDriver driver = new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 
		 driver.get("https://www.flipkart.com/");
		 
		 driver.findElement(By.xpath("//span[text()='✕']")).click();
		
		 driver.findElement(By.xpath("//input[contains(@class,'Pke')]")).sendKeys("mobiles",Keys.ENTER);

		 WebElement name = driver.findElement(By.xpath("//span[text()='APPLE iPhone 14 (Blue, 128 GB)']"));
	
		
	      System.out.println(name.getText());
	
	       
	      WebElement iphoneprice = driver.findElement(By.xpath("//span[text()='APPLE iPhone 14 (Blue, 128 GB)']/ancestor::@div[@class='aMaAEs']/descendant::div[@class='_30jeq3 _16Jk6d']"));
			
	      System.out.println(iphoneprice.getText());
}
}