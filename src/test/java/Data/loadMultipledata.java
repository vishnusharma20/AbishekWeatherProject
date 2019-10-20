package Data;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import ExcelUtil.Getdata;

public class loadMultipledata {
	
	public WebDriver driver;
	
	@BeforeMethod
	public void setup()
	{
		System.setProperty("webdriver.gecko.driver", "C:\\selenium\\chrome\\geckoDriver.exe");
		driver =new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.linkedin.com/login?fromSignIn=true&trk=guest_homepage-basic_nav-header-signin");
	}

	@Test(dataProvider = "getLogindata")
	public void loginTest(String username,String password)
	{
		driver.findElement(By.name("session_key")).sendKeys(username);
		driver.findElement(By.name("session_password")).sendKeys(password);
		driver.findElement(By.xpath("//*[@type='submit']")).click();
	}

	@DataProvider(name = "getLogindata")
	public Object[][] getLogindata() throws IOException
	{
		Object[][] arrayObject=Getdata.getTestData("C:\\Gir checkout\\comDataProvider\\src\\Testdata\\Testdata.xls","login");
		return arrayObject;
	}

	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}


}
