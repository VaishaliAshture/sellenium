package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class idLocator {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		// to identify the username textfield and perform my action
		driver.findElement(By.id("email")).sendKeys("vaishaliashture@gmail.com");
		Thread.sleep(2000);
		driver.close();
	}

}
