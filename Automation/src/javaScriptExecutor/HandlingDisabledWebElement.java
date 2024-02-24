package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingDisabledWebElement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/?scenario=1");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[text()='Disabled']")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Thread.sleep(2000);
		js.executeScript("document.getElementById('name').value='vaishali'");
		Thread.sleep(2000);
		js.executeScript("document.getElementById('email').value='abc@gmail.com'");
		Thread.sleep(2000);
		js.executeScript("document.getElementById('password').value='123@w'");
		// identify the disabled button
		Thread.sleep(2000);
		WebElement disabledButton = driver.findElement(By.xpath("//button[text()='Register']"));
		js.executeScript("arguments[0].click()",disabledButton);
		
		
	}

}
