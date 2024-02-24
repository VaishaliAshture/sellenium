package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenWebElement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.facebook.com/");
		// to create account
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		// to select custom radio button
		driver.findElement(By.xpath("//label[text()='Custom']")).click();
		// to click on gender options
		WebElement hidden = driver.findElement(By.xpath("//input[@name='custom_gender']"));

		JavascriptExecutor js = (JavascriptExecutor) driver;

		Thread.sleep(5000);

		js.executeScript("arguments[0].value='Transgender'", hidden);

		Thread.sleep(5000);

		//js.executeScript("arguments[0].value=''", hidden);
		
		
	}

}
