package test;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.scrolldown;

public class scrolltest {
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

     scrolldown ab =new scrolldown(driver);
     ab.click();
     
     //scroll down
     JavascriptExecutor j=(JavascriptExecutor) driver;
     j.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath("/html/body/footer/div[1]/div/div[1]/div[4]/div[5]/a")));;
     j.executeScript("window.scrollBy(0,document.body.scrollHeight)");
     
     //screenshot full
     File so=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
 	 FileHandler.copy(so, new File("E:\\screenfull.png"));
 	 
 	 //screenshot particular content
 	 WebElement dayelement = driver.findElement(By.xpath("//*[@id=\"nav_link_3\"]"));
	 File src=dayelement.getScreenshotAs(OutputType.FILE);
	 FileHandler.copy(src,new File("./ss//content.png"));
	
		
    
     

}}


