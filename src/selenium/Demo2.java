package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo2 {

	public static void main(String[] args)
	{
		List<WebElement>citylist;
	  WebDriver driver=new FirefoxDriver();
	  driver.get("http://redbus.in");
	  driver.findElement(By.id("txtSource")).sendKeys("hyd");
      citylist=driver.findElements(By.xpath(""));
	}

}
