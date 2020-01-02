package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login_page {

	public WebDriver driver;
	
	By email = By.id("user_email");
	By pass =By.id("user_password");
	By login_button = By.name("commit");
	
	public Login_page(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public WebElement EmailID()
	{
		return driver.findElement(email);
	}

	public WebElement password()
	{
		return driver.findElement(pass);
	}
	
	public WebElement loginButton()
	{
		return driver.findElement(login_button);
	}
	
	
}
