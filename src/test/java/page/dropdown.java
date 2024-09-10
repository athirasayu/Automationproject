package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class dropdown {
	WebDriver driver;
	
	By jprof=By.xpath("//*[@id=\"nav_link_8583\"]");
	By jauto=By.xpath("//*[@id=\"plp-category-desk\"]/div[1]/div/div[1]/div[2]/div/span");
    By jcar=By.xpath("//*[@id=\"category-8844\"]/div[1]/div/div/a");
	public dropdown(WebDriver driver)
	{
		this.driver=driver;
	}
	public void click()
	{
		driver.findElement(jprof).click();
		driver.findElement(jauto).click();
		driver.findElement(jcar).click();
		
}}

