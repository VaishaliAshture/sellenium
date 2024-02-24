package windowHandling;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				driver.get("https://www.flipkart.com/");
			
				driver.findElement(By.name("q")).sendKeys("iphone",Keys.ENTER);
				Thread.sleep(2000);
			
				//to click on first product
				driver.findElement(By.className("_4rR01T")).click();
				// it will give parent as well as child id
				Set<String> all_id = driver.getWindowHandles();
				
				for( String id:all_id)
				{
					driver.switchTo().window(id);
					if (driver.getTitle().equals("Apple iPhone 15 (Blue, 128 GB)"));
					{
						break;
					}
				}
				// to click on add to cart button
				driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
					

	}

}
