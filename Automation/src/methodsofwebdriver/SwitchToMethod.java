package methodsofwebdriver;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToMethod {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// to launch zomato application
		driver.get("https://www.flipkart.com/");
		
		driver.switchTo().activeElement().sendKeys("poha",Keys.ENTER);
		
		
	}

}
