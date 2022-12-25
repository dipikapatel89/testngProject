package testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class WindowHandling {
    WebDriver driver;
	
    @BeforeMethod
	public void init()
	{
		System.setProperty("webdriver.chrome.driver","driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://www.yahoo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
    @Test
    public void windowHandle()
    {
    	String title=driver.getTitle();
    	System.out.println("title of first window "  +title);
    	String handle=driver.getWindowHandle();
    	System.out.println("handle is: "  +handle);
    	
    	driver.findElement(By.xpath("//*[@id=\"ybar-sf\"]/input[1]")).sendKeys("selenium");;
    	driver.findElement(By.xpath("//*[@id=\"ybar-search\"]")).click();;

    }
}
