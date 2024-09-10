package page;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class search {
	WebDriver driver;
	//search mobile
	By jsearch=By.xpath("//*[@id=\"autocomplete-0-input\"]");
	//search first mobile
	By jmob=By.xpath("/html/body/main/section/div[1]/div/div[2]/div[3]/div/div/ol/li[1]/a/div[2]/div[2]/div/div[2]");
	//add to cart
	By jadd=By.xpath("/html/body/main/section/section[2]/div[1]/div[2]/div[1]/div/div[3]/div[1]/button");
	
	public search(WebDriver driver)
	{
		this.driver=driver;
	}
	public void set(String search)
	{
		driver.findElement(jsearch).sendKeys(search,Keys.ENTER);
		
	}
	public void click()
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/main/section/div[1]/div/div[2]/div[3]/div/div/ol/li[1]/a/div[2]/div[2]/div/div[2]")));
		driver.findElement(By.xpath("/html/body/main/section/div[1]/div/div[2]/div[3]/div/div/ol/li[1]/a/div[2]/div[2]/div/div[2]")).click();

		WebDriverWait w=new WebDriverWait(driver,Duration.ofSeconds(60));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/main/section/section[2]/div[1]/div[2]/div[1]/div/div[3]/div[1]/button")));
		driver.findElement(By.xpath("/html/body/main/section/section[2]/div[1]/div[2]/div[1]/div/div[3]/div[1]/button"));
	
		
		
	}}



		
		
		

		
		

	
