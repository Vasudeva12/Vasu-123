package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo {

	public static void main(String[] args) 
	{
     java.util.List<WebElement>links;
	 WebDriver driver=new FirefoxDriver();
	 driver.get("http://google.com");
	 links=driver.findElements(By.tagName("a"));
	 System.out.println(links.size());
	 for (int i = 0; i < links.size(); i++)
	 {
		System.out.println(links.get(i).getText());
	}
	 
		
		
		
		
		
	}

}
