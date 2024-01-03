package assignmentOfSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginToDemoWebShop {

	public static void main(String[] args) throws InterruptedException {
		WebDriver  driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/register");
		
		// to click on login link
	    driver.findElement(By.linkText("Log in")).click();
	    // to enter email
	    driver.findElement(By.className("email")).sendKeys("ashture@gmail.com");
	    // to enter password
	    driver.findElement(By.id("Password")).sendKeys("Vai@123");
	    // to click on check box
	    driver.findElement(By.id("RememberMe")).click();
	    Thread.sleep(2000);
	    // to click on login button
	    driver.findElement(By.className("login-button")).click();
	    Thread.sleep(2000);
	    driver.quit();
		
	}

}