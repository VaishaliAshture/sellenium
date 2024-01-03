package methodsofwebdriver;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPosition {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		Point p = new Point(300, 200);
		driver.manage().window().setPosition(p);
	}
 
}
