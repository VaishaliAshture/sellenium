package assignmentOfSelenium;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AirVisttarDepAndInd {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.airvistara.com/in/en");

		WebElement cookies = driver.findElement(By.xpath("//button[contains(text(),'Accept All')]"));
		cookies.click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='flightSearchFrom']")).sendKeys("PNQ");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='flightSearchTo']")).sendKeys("DEL");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='departCalendar']")).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='30']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='31']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='book-flight-widget']")).click();

		driver.findElement(By.xpath("//button[text()='Search Flights']")).click();
	}

}
