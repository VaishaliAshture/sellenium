package takeScreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.google.common.io.Files;

public class Way1ToTakeScreenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		 WebDriver driver = new FirefoxDriver();
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
			driver.get("https://www.apple.com/in/iphone/");
			//use explicit type casting
			TakesScreenshot ts = (TakesScreenshot) driver;
			
		   File src = ts.getScreenshotAs(OutputType.FILE);
		   
		   File dest = new File("./screenshot/iphone.png");
		   
		   Files.copy(src, dest);
		   
			
			


	}

}
