package takeScreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class takeScreenshotOfNetflix {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.netflix.com/in/");
		// to click on sign in button
		driver.findElement(By.xpath("//a[text()='Sign In']")).click();
		// to fill the email
		WebElement username = driver.findElement(By.className("nfTextField"));
		username.sendKeys("abc@gmail.com");
		
		// to fill the pwd
		driver.findElement(By.id("id_password")).sendKeys("234de");
		
		// to click on signin
		driver.findElement(By.xpath("//button[text()='Sign In']")).click();
		
		Thread.sleep(2000);
		//to use explicit type casting
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		File src = ts.getScreenshotAs(OutputType.FILE);
		
		File dest = new File("./screenshot/fullscreenofnetflix.png");
		Files.copy(src, dest);
		

	}

}
