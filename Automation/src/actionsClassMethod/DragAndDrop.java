package actionsClassMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demoapps.qspiders.com/dragDrop/dragToCorrect?sublist=1");
		
		WebElement drag = driver.findElement(By.xpath("//div[text()='Moblie Charger']"));
		

		WebElement drop = driver.findElement(By.xpath("//div[text()='Moblie Accessories']"));
		
		
		Actions act = new Actions(driver);
		
		act.dragAndDrop(drag, drop).perform();
		
		driver.quit();
		

	}

}
