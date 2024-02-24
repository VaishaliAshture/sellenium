package popupsHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class YatraAssignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.yatra.com/");
		// to click on hotel button
		driver.findElement(By.id("booking_engine_hotels")).click();
		Thread.sleep(4000);
		// to select destination
		driver.findElement(By.xpath("//input[@id='BE_hotel_destination_city']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='viewport']/descendant::li[5]")).click();
		
		// to click on check in date
		driver.findElement(By.id("BE_hotel_checkin_date")).click();
		Thread.sleep(2000);
		// to click check in  date
		driver.findElement(By.id("21/01/2024")).click();
		// to click on check out date
		driver.findElement(By.id("25/01/2024")).click();
		// to click on travell and hotels
		driver.findElement(By.className("txt-ellipses")).click();
		
		// to select adults
		for (int i=1; i<=3;i++)
		{
			driver.findElement(By.xpath("(//span[@class='ddSpinnerPlus'])[1]")).click();
		}
		// to click on add room
		driver.findElement(By.xpath("//a[@class='hoteladdRoom eventTrackable js-prodSpecEvtCat active']")).click();
		Thread.sleep(2000);
		// to click on search hotel
		driver.findElement(By.xpath("//input[@id='BE_hotel_htsearch_btn']")).click();
		
		
		
	}

}
