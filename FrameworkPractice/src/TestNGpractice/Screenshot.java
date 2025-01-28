package TestNGpractice;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.Test;

public class Screenshot {
  
	@Test
	public void takeScreenShot()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		//Step 1 create object to EventfiringwebDriver
		
		EventFiringWebDriver  edriver=new EventFiringWebDriver(driver);
		//step 2 use getScreenShotAs method to get file type of screenshot
		File src=edriver.getScreenshotAs(OutputType.FILE);
		
		
	}
	
	
}
