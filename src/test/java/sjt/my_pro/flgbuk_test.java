package sjt.my_pro;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class flgbuk_test extends app_test {
	
	@Test 
	public void fb() throws InterruptedException {
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).sendKeys("Hyderabad");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']")).sendKeys("Pune");
		Thread.sleep(3000);
		List <WebElement> l= driver.findElements(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first']//a[@class='ui-state-default'][contains(text(),'')]"));
		for (WebElement ele:l) {
			String k = ele.getText();
			System.out.println(k);
			if (k.equalsIgnoreCase("21")) {
				ele.click();
			}			
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='Div1']//button[@class='ui-datepicker-trigger']")).click();
		List <WebElement> a= driver.findElements(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-last']//a[@class='ui-state-default'][contains(text(),'')]"));
		for (WebElement elf:a) {
			String m = elf.getText();
			if (m.equalsIgnoreCase("11")) {
				elf.click();
			}			
		}	
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.findElement(By.id("divpaxinfo")).click();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		Select s = new Select (driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_Adult']")));
	   s.selectByVisibleText("4");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	   Select s1 = new Select (driver.findElement(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']")));
	   s1.selectByVisibleText("USD");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	   driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_btn_FindFlights']")).click();
	}
	
	

	}

}
