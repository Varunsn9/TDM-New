import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Scream_Test  extends Base_Class{

	@Test
	public void Transformers() throws InterruptedException {

		
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--incognito");
		driver=new ChromeDriver(opt);	
//		OperaOptions op=new OperaOptions();
//		op.addArguments("--incognito");
//		driver=new OperaDriver(op);
		driver.manage().window().maximize();
		try{
			driver.get("https://www.youtube.com/watch?v=WjmTJtsq97A");
			try {
				driver.findElement(By.xpath("//button[@aria-label='Play']")).click();
			}catch(Exception e) {
				driver.navigate().refresh();
				driver.findElement(By.xpath("//button[@aria-label='Play']")).click();
			}
		}catch(Exception e){
			driver.navigate().refresh();
			Thread.sleep(3000);
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
			
		}	
		System.out.println("built complete");
		
	}
}
//https://www.youtube.com/watch?v=WjmTJtsq97A
