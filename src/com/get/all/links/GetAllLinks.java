package com.get.all.links;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GetAllLinks {
@Test
public void launchSite() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\KUNAL BHATTA\\Downloads\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://jio.com");
	List<WebElement>  lst=(List)driver.findElements(By.xpath("//a"));
	System.out.println(lst.size());
	/*for(int i=0;i<lst.size();i++) {
		String actuallink=lst.get(i).getText();
		System.out.println(actuallink);
	}*/
	for(WebElement obj:lst) {
	System.out.println(obj.getText());	
	}
	driver.close();
}
}
