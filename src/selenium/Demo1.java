package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo1 {

	public static void main(String[] args)
	{
	  String empid;
     WebDriver driver=new FirefoxDriver();
     driver.get("http://opensource.demo.orangehrm.com");
     driver.findElement(By.id("txtUsername")).sendKeys("Admin");
     driver.findElement(By.id("txtPassword")).sendKeys("admin");
     driver.findElement(By.name("Submit")).click();
     driver.findElement(By.linkText("PIM")).click();
     driver.findElement(By.linkText("Add Employee")).click();
     driver.findElement(By.id("firstName")).sendKeys("chandan");
     driver.findElement(By.id("lastName")).sendKeys("kumar");
     empid=driver.findElement(By.id("employeeId")).getText();
     System.out.println(empid);
    driver.findElement(By.id("employeeId")).clear();
     driver.findElement(By.id("employeeId")).sendKeys("0012");
     driver.findElement(By.id("btnSave")).click();
     
     
     
     
	}

}
