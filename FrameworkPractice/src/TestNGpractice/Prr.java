package TestNGpractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Prr {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.flipkart.com/search?q=iphone+15+pro&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off&as-pos=1&as-type=HISTORY");
         List<WebElement> ele = driver.findElements(By.xpath("//div[@class='KzDlHZ']"));
         for(WebElement ele1:ele)
         {
        	 System.out.println(ele1.getText());
        }
         List<WebElement> ele3 = driver.findElements(By.xpath("//div[@class='Nx9bqj _4b5DiR']"));
         for(WebElement ele5:ele3)
         {
        	 System.out.println(ele5.getText());
        }
         int n=ele.size();
         for(int i=0;i<n;i++)
         {
        	 System.out.println(ele.get(i).getText()+" "+ele3.get(i).getText());
         }
         
         FileInputStream fis= new FileInputStream("C:\\Users\\HP\\Desktop\\Flipkart.xlsx");
         
	}

}
