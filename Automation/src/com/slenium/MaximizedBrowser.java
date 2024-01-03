package com.slenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaximizedBrowser {
	public static void main(String[]args) {
		// to launch the browser
		WebDriver driver =new ChromeDriver();
		//to maximize the browser
		// Options opt driver.manage();
		// Window win = opt.window();
		// win.maximize();
		driver.manage().window().maximize();
	
	
	}

}
