package assignmentOfSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginForInstagram {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com");
	      String title = driver.getTitle();
	      System.out.println(title);
	      driver.findElement(By.name("username")).sendKeys("6754338859");
	      driver.findElement(By.name("password")).sendKeys("vaishali@123");
	      driver.findElement(By.className("_acap")).click();
	      
	}

}
