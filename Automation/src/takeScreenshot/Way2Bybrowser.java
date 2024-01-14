package takeScreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.google.common.io.Files;

public class Way2Bybrowser {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		 ChromeDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
			driver.get("https://www.apple.com/in/iphone/");
			
			//to use get screenShotas method
		   File src = driver.getScreenshotAs(OutputType.FILE);
		   
		   File dest = new File("./screenshot/iphone1.png");
		   
		   Files.copy(src, dest);
		   
			
	}

}
