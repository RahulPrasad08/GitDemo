package practise.AppiumFramework;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import pageObject.HomePage;

public class ApiDemoTest extends base {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        AndroidDriver<AndroidElement> driver = capabilities("ApiDemos");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.setPowerCapacity(100);

		HomePage h = new HomePage(driver);
		h.Signin.click();
		h.email.sendKeys("sons.rahul@gmail.com");
		h.continu.click();
		h.password.sendKeys("LaLpur@1239");
		h.login.click();
		h.action_bar_burger_icon.click();
		h.Settings.click();
	}
}
