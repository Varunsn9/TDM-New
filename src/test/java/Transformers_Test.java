import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.managers.ChromiumDriverManager;

public class Transformers_Test extends Base_Class{

	@Test
	public void Transformers() throws InterruptedException {

		
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--incognito");
		driver=new ChromeDriver(opt);
		
//		
//		OperaOptions op=new OperaOptions();
//		op.addArguments("--incognito");
//		driver=new OperaDriver(op);
		driver.manage().window().maximize();
		try{
			driver.get("https://www.youtube.com/watch?v=9elBYEpnPQw");
			try {
				driver.findElement(By.xpath("//button[@aria-label='Play']")).click();
			}catch(Exception e) {
				driver.navigate().refresh();
				driver.findElement(By.xpath("//button[@aria-label='Play']")).click();
			}
		}catch(Exception e){
			driver.navigate().refresh();
			Thread.sleep(360000);
		}
		//driver.findElement(By.xpath("//button[@class='ytp-large-play-button ytp-button']")).click();
		String currentTitle=driver.getTitle();
		for (int i=0;i<2;i++) {
			if(!driver.getTitle().contentEquals(currentTitle)) {
				driver.quit();
			}else {
				Thread.sleep(10000);
				i=0;
			}
			try {
				//driver.quit();
			}catch(Exception e) {
				
			}
		}	
		System.out.println("built");
	}
}

