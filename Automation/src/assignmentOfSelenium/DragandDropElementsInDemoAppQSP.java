package assignmentOfSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.AbstractWebDriverEventListener;

public class DragandDropElementsInDemoAppQSP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.navigate().to("https://demoapps.qspiders.com/?scenario=1");
		
		//to click on mouse actions
		driver.findElement(By.xpath("//section[text()='Mouse Actions']")).click();
		// to click on drag and drop button
	  driver.findElement(By.xpath("//section[text()='Drag & Drop']")).click();
	  // to click on drag position button
	  driver.findElement(By.xpath("//a[text()='Drag Position']")).click();
	  
	  //to create object of actions class
	Actions  act = new Actions(driver);
	//to drag and drop (we have stored it direct without creating object variable)
	act.dragAndDrop(driver.findElement(By.xpath("//div[text()='Mobile Charger']")),driver.findElement(By.xpath("//div[text()='Mobile Accessories']"))).perform();
	
	act.dragAndDrop(driver.findElement(By.xpath("//div[text()='Mobile Cover']")),driver.findElement(By.xpath("//div[text()='Mobile Accessories']")) ).perform();
	
	//to drag and drop
	WebElement drop = driver.findElement(By.xpath("//div[text()='Laptop Charger']"));
	
	WebElement drag = driver.findElement(By.xpath("//div[text()='Laptop Accessories']"));
	
	act.dragAndDrop(drop, drag).perform();
	
    WebElement drop2 = driver.findElement(By.xpath("//div[text()='Laptop Cover']"));
	
	WebElement drag2 = driver.findElement(By.xpath("//div[text()='Laptop Accessories']"));
	
	act.dragAndDrop(drop2, drag2).perform();
	
	
	
	
	
	
	}

}
