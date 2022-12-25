package testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTestWithFirefox {

	WebDriver driver;
	@BeforeMethod
	public void init()
	{
		//System.setProperty("webdriver.gecko.driver", value);
		driver=new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://techfios.com/billing/?ng=admin/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
	}
	/*@Test
	public void loginTest()
	{
		driver.findElement(B)
	}*/
}
