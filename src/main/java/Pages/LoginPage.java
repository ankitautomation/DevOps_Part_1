package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
 

public class LoginPage extends Utilities.BaseClass {

	   // Object Repository
		By username = By.xpath("//input[@name='email' and @type='text']");
		By password = By.name("password");
		By btn_login = By.xpath("//span[contains(text(),'Login')]");
		By forgotpass_link = By.xpath("//a[@id='link-forgot']");
		
		public LoginPage()
		{
			PageFactory.initElements(driver, this);
		}
		
		public String validateLoginPageTitle()
		{
			return driver.getTitle();
		}
		
		// Page Chaining Model 
		
		public DashboardPage loginFunction(String un, String pwd)
		{
			driver.findElement(username).sendKeys(un);
			driver.findElement(password).sendKeys(pwd);
			driver.findElement(btn_login).click();
			
			return new DashboardPage();
		}
		
		public void click_on_rememberme()
		{
			driver.findElement(forgotpass_link).click();
		}
	
}
