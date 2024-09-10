package test;

import java.net.HttpURLConnection;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chromium.ChromiumOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.login;
import page.search;


public class logintest {
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

     login ab =new login(driver);
     ab.sign();
    driver.navigate().back();
     //title verification
     String actual=driver.getTitle();
		System.out.println(actual);
		String expected="JioMart";
		if(expected.equals(actual))
		{
		System.out.println("pass")	;
		}
		else
		{
			System.out.println("fail");
		}
		
		//LOGO verification
		WebElement sc=driver.findElement(By.xpath("/html/body/header/section[1]/div/section[1]/div[1]/a/img"));
		boolean b=sc.isDisplayed();
		if(b)
		{
			System.out.println("logo displayed");
		}
		else
		{
			System.out.println("not displayed");
		
		}}}



		
     
     
     
     


