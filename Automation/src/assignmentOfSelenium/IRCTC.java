package assignmentOfSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IRCTC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		    
			driver.get("https://www.redbus.in/railways");
			driver.findElement(By.id("src")).click();
			driver.findElement(By.xpath("//div[text()='New Delhi']")).click();
			driver.findElement(By.id("dst")).click();
			driver.findElement(By.xpath("//div[text()='Kalyan Jn']")).click();
			driver.findElement(By.className("//img[@alt='calendar_icon']")).click();
			driver.findElement(By.id("Layer_1")).click();
			driver.findElement(By.className("sc-htoDjs iZbCio")).click();
			driver.findElement(By.xpath("//div[text()='SEARCH TRAINS']")).click();
			

	}

}
