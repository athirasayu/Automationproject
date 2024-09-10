package test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.dropdown;

public class droptest {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
	driver=new ChromeDriver();
	}
	@BeforeMethod
	public void url()
	{
		driver.get("https://www.jiomart.com/");
	}
	@Test
	public void test() throws Exception
	{
		dropdown dw=new dropdown(driver);
		dw.click();
		WebElement s=driver.findElement(By.xpath("//*[@id=\"plp-category-desk\"]/div[1]/div/div[1]/div[1]/button"));
		boolean bo=s.isSelected();
		if(bo)
		{
			System.out.println("dropdown selected");
		}
		else
		{
			System.out.println("not selected");
	}
		
	}}
			
			
		
		
	


