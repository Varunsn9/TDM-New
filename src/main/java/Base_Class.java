import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.Optional;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.config.DriverManagerType;
import io.github.bonigarcia.wdm.managers.ChromiumDriverManager;

public class Base_Class {

	public WebDriver driver;
	public WebDriverManager manager;
	public WebDriver_Utilities wlib;
	
	@BeforeClass
	public void openBrowser(){
		//manager.operadriver().setup();
		manager.chromedriver().setup();
		//manager.edgedriver().setup();
		//manager.firefoxdriver().setup();
		//manager.chromiumdriver().setup();
	}
	@BeforeMethod
	public void login() {
		
	}
	@AfterClass
	public void closeBrowser(){
		
	}
	@AfterMethod
	public void logout() {
		
	}
}
