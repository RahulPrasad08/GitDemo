package practise.AppiumFramework;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class ApiDemoTest1 extends base {


	@Test
	public void totalValidation() throws IOException {
		// TODO Auto-generated method stub
		
		AndroidDriver<AndroidElement> driver = capabilities("ApiDemos");
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//android.widget.Button[@text='Already a customer? Sign In']")).click();	
	    	
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);       
        driver.findElement(By.xpath ("//android.widget.EditText[@index='1']")).sendKeys("sons.rahul@gmail.com");
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
        driver.findElement(By.xpath("//android.widget.Button[@text='Continue']")).click();
      
      /*  driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.findElement(By.xpath ("//android.widget.EditText[@text='Amazon password']")).sendKeys("LaLpur@1239");
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.findElement(By.xpath ("//android.widget.Button[@text='Login']")).click();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);{
        driver.findElement(By.id("in.amazon.mShop.android.shopping:id/action_bar_burger_icon")).click();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.findElement(By.id("in.amazon.mShop.android.shopping:id/action_bar_burger_icon")).click();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//android.widget.TextView[@text='Settings']")).click();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//android.widget.TextView[@text='Settings']")).click();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
*/	

	}
	}
