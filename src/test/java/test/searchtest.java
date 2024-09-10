package test;

import java.net.HttpURLConnection;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.search;

public class searchtest {
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
	 search jb=new search(driver);
	 jb.set("mobiles");
	 jb.click();
	//URL verification
 URL ob=new URL("https://www.jiomart.com/");
HttpURLConnection con=(HttpURLConnection)ob.openConnection();
int code=con.getResponseCode();
System.out.println(code);
con.connect();
if(con.getResponseCode()==200)
{
System.out.println("valid url");
}
else
{
System.out.println("invalid");
}
	
 }
}