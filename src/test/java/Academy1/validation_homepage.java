package Academy1;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObject.LandingPage;
import pageObject.Login_page;
import resources.baseinformation;

public class validation_homepage extends baseinformation {
	public static Logger log =LogManager.getLogger(baseinformation.class.getName());
	@BeforeTest
	public void initilize() throws IOException
	{
		driver = initializeDriver();
		log.info("Driver is initialized");
		driver.get(url);
		log.info("Landing to home page");
	}
	
	@Test
	public void PageNavigation() throws IOException
	{	
		LandingPage lp = new LandingPage(driver);
		AssertJUnit.assertEquals(lp.bodytitle().getText(),"FEATURED COURSE");
		AssertJUnit.assertTrue(lp.menu().isDisplayed());
		log.info("Text is available");
	}
	
	@AfterTest
	public void tearsdown()
	{
		driver.close();
	}
}
