package assignmentOfSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		// launch web application
		driver.get("http://madhav/login.do");
		

		// to identify username text field
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		// to identify the password text field
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		// to identify the login button
		driver.findElement(By.id("loginButton")).click();
		
		driver.findElement(By.xpath("//a[@class='content tasks']")).click();
		
		driver.findElement(By.xpath("//a[@text()='Projects & Customers']")).click();
		
		driver.findElement(By.xpath("//input[@value=\"Create New Customer\"']")).click();
		
		

	}

}
