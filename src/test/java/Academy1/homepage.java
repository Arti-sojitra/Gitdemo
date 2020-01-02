package Academy1;

import org.testng.annotations.Test;


import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObject.LandingPage;
import pageObject.Login_page;
import resources.baseinformation;

public class homepage extends baseinformation {
	public static Logger log =LogManager.getLogger(baseinformation.class.getName());
	@BeforeTest
	public void initilize() throws IOException
	{
		driver = initializeDriver();
		log.info("Driver is initialized");
	}
	
	@Test(dataProvider="getdata")
	public void PageNavigation(String username,String password) throws IOException
	{
		driver.get(url);
		LandingPage lp = new LandingPage(driver);
		lp.LoginPage().click();
		log.info("click the login");
		Login_page lop = new Login_page(driver);
		lop.EmailID().sendKeys(username);
		lop.password().sendKeys(password);
		lop.loginButton().click();
		log.info("click to login");
	}
	
	@AfterTest
	public void tearsdown()
	{
		driver.close();
	}
	
	@DataProvider
	public Object[][]  getdata()
	{
		Object[][] data=new Object[2][2];
		
		data[0][0]="dobariya.aarti@gmail.com";
		data[0][1]="123456";
		data[1][0]="aarti.keyur.sojitra@gmail.com";
		data[1][1]="789456";

		return data;
	}

}
