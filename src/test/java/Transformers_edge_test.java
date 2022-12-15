import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.Test;

public class Transformers_edge_test extends Base_Class {
	
	@Test
	public void test() {
		 EdgeOptions op=new EdgeOptions();
         op.setCapability("InPrivate", true);
		driver = new EdgeDriver(op);
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
