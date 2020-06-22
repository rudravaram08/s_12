package sjt.my_pro;

import org.testng.annotations.AfterSuite;

public class cls_test extends app_test {
	@AfterSuite
	public void ac() {
		driver.close();
	}
	

}
