package assignmentOfSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementMethodOnMyntra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
    WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.myntra.com/");
		
	WebElement women = driver.findElement(By.xpath("//a[contains(text(),'Wom')]"));
	
	Actions act = new Actions(driver);
	
   act.moveToElement(women).perform();
   
   driver.quit();
	}

}
