package methodsofwebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.accessibility.model.AXNodeId;

public class NavigateMethod {
	public static void main(String[] args) throws InterruptedException {
		// to launch browser
		WebDriver driver = new ChromeDriver();
		// to maximize
		driver.manage().window().maximize();
		//to open web page
		driver.get("https://www.zomato.com/");
		// to navigate application
		driver.navigate().to("https://www.swiggy.com/");
		// to go back
		Thread.sleep(2000);
		driver.navigate().back();
		// to go forward
		Thread.sleep(2000);
		driver.navigate().forward();
		// to refresh
		Thread.sleep(2000);
		driver.navigate().refresh();
		
		// to close
		driver.quit();
		
		
	}

}
