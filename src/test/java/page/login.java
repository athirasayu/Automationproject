package page;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class login {
	WebDriver driver;

  By jsign =By.xpath("//*[@id=\"jm_header_user_icon\"]");
  
   public login(WebDriver driver)
	{
		this.driver=driver;
	}
  
   public void sign()
   {
	   driver.findElement(jsign).click();
	   
  }

	
		
	}




