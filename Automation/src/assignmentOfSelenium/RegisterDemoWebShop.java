package assignmentOfSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterDemoWebShop {
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver =	new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/register");
	driver.findElement(By.linkText("Register")).click();
	// to select radio button
	driver.findElement(By.id("gender-female")).click();
	
	// to enter first name
	driver.findElement(By.name("FirstName")).sendKeys("vaishali");
	// to enter last name
	driver.findElement(By.id("LastName")).sendKeys("ashture");
	// to enter email
	driver.findElement(By.name("Email")).sendKeys("vaishali@gmail.com");
	// to enter password
	driver.findElement(By.name("Password")).sendKeys("Ash@123");
	// to enter confirm password
	driver.findElement(By.name("ConfirmPassword")).sendKeys("Ash@123");
	Thread.sleep(2000);
	// to click on register button
	driver.findElement(By.className("register-next-step-button")).click();
	// to close app
	
	
	
	}

}
