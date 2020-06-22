package sjt.my_pro;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeSuite;

public class app_test {
	
public WebDriver driver;
	
	@BeforeSuite
	public void bo() {
    driver = new FirefoxDriver();
	driver.get("https://www.spicejet.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	String title= driver.getTitle();
	System.out.println(title);
	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	}

}
