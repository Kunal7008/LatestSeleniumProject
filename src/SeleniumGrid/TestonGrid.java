package SeleniumGrid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class TestonGrid {
@Test
public void test1() throws MalformedURLException {
	/*DesiredCapabilities caps= new DesiredCapabilities();
	caps.setBrowserName("chrome");
	caps.setPlatform(Platform.WIN10);
	ChromeOptions options= new ChromeOptions();
	options.merge(caps);
	URL url= new URL("http://192.168.0.101:4444/wd/hub");*/
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\KUNAL BHATTA\\Downloads\\chromedriver.exe");
	//WebDriver driver= new RemoteWebDriver(url, options);
	WebDriver driver= new ChromeDriver();
	// launch the browser
	driver.get("https://jio.com");
	System.out.println("Title is:"+driver.getTitle());
	driver.quit();
}
}
