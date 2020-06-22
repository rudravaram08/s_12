package sjt.my_pro;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.BeforeClass;

public class openc_test extends app_test {

	@BeforeClass 
	public void ao()
	{
	
	
	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	System.out.println("app_opened");

	}
}
