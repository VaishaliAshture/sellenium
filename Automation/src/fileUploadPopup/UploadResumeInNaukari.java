package fileUploadPopup;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class UploadResumeInNaukari {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.naukri.com/");
		Thread.sleep(1000);
		// to click on register button
		driver.findElement(By.id("register_Layer")).click();

		// to click on upload resume
		driver.findElement(By.xpath("//button[text()='Upload Resume']")).click();
		
		// integrated autoit with eclipse
	    Runtime.getRuntime().exec("./AutoIT/NaukriFileUpload.exe");
	}

}


