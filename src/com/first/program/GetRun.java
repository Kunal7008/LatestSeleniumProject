package com.first.program;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GetRun {
	WebDriver driver;
@Test
public void run() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\KUNAL BHATTA\\Downloads\\chromedriver.exe" );
	driver= new ChromeDriver();
	driver.get("https://jio.com");
}
}
