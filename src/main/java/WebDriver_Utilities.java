import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriver_Utilities {
public void explicitlyWait(WebDriver driver,String currentTitle,int seconds)
{
	WebDriverWait wait=new WebDriverWait(driver, seconds);
	wait.until(ExpectedConditions.titleIs(currentTitle));
}
public void implicitlyWaitingCondition(WebDriver driver) {
	driver.manage().timeouts().implicitlyWait(100000, TimeUnit.SECONDS);
}
}
