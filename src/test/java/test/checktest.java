
package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement; 
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.checkbox;


public class checktest {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}
	@BeforeTest
	public void url()
	{
		driver.get("https://www.jiomart.com/");
	}
	@Test
	public void test()
	{
		checkbox co=new checkbox(driver);
		co.click();
		//check box
		WebElement s=driver.findElement(By.xpath("//*[@id=\"in_stock_check\"]"));
		boolean bo=s.isSelected();
		if(bo)
		{
			System.out.println("checkbox selected");
		}
		else
		{
			System.out.println("not selected");
	}
		//content check
		 String actualsource=driver.getPageSource();
		    String expected="fashion";
			if(actualsource.contains(expected))
			{
				System.out.println("test pass");
			}
			else
			{
				System.out.println("test fail");
			}
				

}}
