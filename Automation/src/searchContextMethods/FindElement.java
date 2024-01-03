package searchContextMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElement {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.flipkart.com/");
		 
		 driver.findElement(By.xpath("//span[text()='✕']")).click();
		
		 driver.findElement(By.xpath("//input[contains(@class,'Pke')]")).sendKeys("mobile",Keys.ENTER);
          
		 WebElement name = driver.findElement(By.xpath("//div[@class='_4rR01T']"));
            
            
          System.out.println(name.getText());
	}


}