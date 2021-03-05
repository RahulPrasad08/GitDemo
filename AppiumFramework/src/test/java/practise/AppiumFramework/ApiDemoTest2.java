package practise.AppiumFramework;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import pageObject.HomePage;
import pageObject.Language;

public class ApiDemoTest2 extends base {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        AndroidDriver<AndroidElement> driver = capabilities("ApiDemos");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		Language lan = new Language(driver);
		lan.skipSignIn.click();
		lan.action_bar_burger_icon.click();
		lan.Language.click();
		String prelanguage = lan.preffered_Language.getText();
		System.out.println(prelanguage);
		
	}
}
