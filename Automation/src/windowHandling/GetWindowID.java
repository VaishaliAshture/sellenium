package windowHandling;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowID {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("iphone",Keys.ENTER);
		//to click on first product
		driver.findElement(By.className("_4rR01T")).click();
		// it will give the parent id
        String parent_window_id = driver.getWindowHandle();
        System.out.println("parent window id is:"+parent_window_id);
        // it will give the parent as well as child window id
        Set<String> all_id = driver.getWindowHandles();
        System.out.println("all id is:"+all_id);
		

	}

}
