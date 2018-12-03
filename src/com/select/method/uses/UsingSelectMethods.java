package com.select.method.uses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class UsingSelectMethods {
@Test
public void runMyProgram() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\KUNAL BHATTA\\Downloads\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.navigate().to("https://facebook.com");
	WebElement element=driver.findElement(By.id("day"));
	Select select= new Select(element);
	select.selectByVisibleText("26");
}
}
