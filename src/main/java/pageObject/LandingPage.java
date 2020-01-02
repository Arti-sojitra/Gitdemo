package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

	public WebDriver driver;
	By login = By.cssSelector("a[href*='sign_in']");
	By title = By.xpath("/html/body/section[1]/div/div/h2");
	By menubar = By.cssSelector(".navbar-collapse");
	
	public LandingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public WebElement LoginPage()
	{
		return driver.findElement(login);
	}
	
	public WebElement bodytitle()
	{
		return driver.findElement(title);
	}
	
	public WebElement menu()
	{
		return driver.findElement(menubar);
	}
}
