package takeScreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class AssignmentOfBluestone {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
     WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.bluestone.com/");
		
		driver.findElement(By.id("denyBtn")).click();
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		   File src = ts.getScreenshotAs(OutputType.FILE);
		   
		   File dest = new File("./screenshot/img.png");
		   
		   Files.copy(src, dest);
		   


	}

}
