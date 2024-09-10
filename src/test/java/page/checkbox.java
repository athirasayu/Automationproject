package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class checkbox {
	WebDriver driver;
	By jewl=By.xpath("//*[@id=\"nav_link_1524\"]");
	By fine=By.xpath("//*[@id=\"plp-category-desk\"]/div/div/div[1]/div[2]/div/span");
	By stock=By.xpath("//*[@id=\"in_stock_filter\"]/div/ul/li/div/label/span");
	
	public checkbox(WebDriver driver)
	{
		this.driver=driver;
	}
	public void click()
	{
		driver.findElement(jewl).click();
		driver.findElement(fine).click();
		driver.findElement(stock).click();
		
}}
