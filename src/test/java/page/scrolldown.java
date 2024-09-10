package page;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class scrolldown {
	WebDriver driver;
	
	By jhome=By.xpath("//*[@id=\"nav_cat_8582\"]");
	By jkit=By.xpath("//*[@id=\"nav_link_8737\"]");
	public scrolldown(WebDriver driver)
	{
		this.driver=driver;
	}
	public void click()
	{
		driver.findElement(jhome);
	    driver.findElement(jkit);

		
	}

}
