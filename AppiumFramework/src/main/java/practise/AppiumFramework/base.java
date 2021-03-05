package practise.AppiumFramework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class base {
	private static final String Samsung = null;
	static WebDriver driver;

	public static AndroidDriver<AndroidElement> capabilities(String appName) throws IOException {

		AndroidDriver<AndroidElement> driver;
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "\\src\\main\\java\\practise\\AppiumFramework\\global.properties");
		Properties prop = new Properties();
		prop.load(fis);
        
		//AndroidDriver<AndroidElement> driver;
       
		File appDir = new File("src");
		File app = new File(appDir, (String) prop.get(appName));
		DesiredCapabilities caps = new DesiredCapabilities();
		// String device = prop.getProperty(Samsung);
		caps.setCapability("deviceName", "Samsung");
		caps.setCapability("udid", "RZ8N90P0AVL");
		caps.setCapability("platformName", "Android");
		caps.setCapability("platformVersion", "10");
		caps.setCapability("appPackage", "in.amazon.mShop.android.shopping");
		caps.setCapability("appActivity", "com.amazon.mShop.home.HomeActivity");

		driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), caps);
		//System.out.println( driver.executeScript("mobile:batteryInfo"));

		return driver;

	}
	public static void getScreenshot(String s) throws IOException
	{
	File scrfile=	((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(scrfile,new File(System.getProperty("user.dir")+"\\"+s+".png"));
	
	}
}
