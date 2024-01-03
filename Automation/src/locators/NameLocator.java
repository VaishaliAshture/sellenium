package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameLocator {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://qspwakad/login.do");
		
		// to identify username text field
		driver.findElement(By.name("username")).sendKeys("admin");
		
		// to identify the password text field
		driver.findElement(By.name("pwd")).sendKeys("manager");
		
		// to identify the login button
		driver.findElement(By.id("loginButton")).click();
		
	}

}
