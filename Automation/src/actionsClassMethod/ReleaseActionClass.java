package actionsClassMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ReleaseActionClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
        WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.navigate().to("https://demoapps.qspiders.com/?scenario=1");
		
		driver.findElement(By.xpath("//section[text()='Mouse Actions']")).click();
		
		driver.findElement(By.xpath("//section[text()='Click & Hold']")).click();
		
		WebElement circle = driver.findElement(By.id("circle"));
		
		//create the object of actions class
	    Actions act = new Actions(driver);
	    //use click and hold
	    act.clickAndHold(circle).perform();
	    
	    Thread.sleep(4000);
	    // use release method
	    act.release().perform();
	    
	    driver.close();
		
	}

}
