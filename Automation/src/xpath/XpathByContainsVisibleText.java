package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByContainsVisibleText {

	 
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		// to close the starting popup
		driver.findElement(By.xpath("//span[text()='✕']")).click();
		Thread.sleep(2000);
		// to click on the cart icon
		driver.findElement(By.xpath("//a[contains(text(),'Car')]")).click();
		

	}

}
