import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.Test;

public class Transformers_FireFox_Test extends Base_Class {

	@Test
	public void test() {
		FirefoxOptions op=new FirefoxOptions();
		op.addArguments("--incognito");
		driver=new FirefoxDriver(op);
		driver.get("https://www.youtube.com/watch?v=9elBYEpnPQw");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[@aria-label='Play']")).click();
		String title=driver.getTitle();
		for(int i=0;i<2;i++)
		if(!title.equalsIgnoreCase(driver.getTitle())) {
			driver.quit();
		}else {
			i=0;
		}
	System.out.println("build completed");
	}
	}
