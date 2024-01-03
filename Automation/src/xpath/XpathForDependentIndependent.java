package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathForDependentIndependent {

	public static void main(String[] args) {
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.flipkart.com/");
		 
		 driver.findElement(By.xpath("//span[text()='✕']")).click();
		
		 driver.findElement(By.xpath("//input[contains(@class,'Pke')]")).sendKeys("mobile",Keys.ENTER);

 WebElement iphoneprice = driver.findElement(By.xpath("//div[text()='APPLE iPhone 14 (Blue, 128 GB)']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1']"));
		 System.out.println(iphoneprice.getText());
	}
}
