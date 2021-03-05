package pageObject;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class HomePage {

	public HomePage(AppiumDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(xpath = "//android.widget.Button[@text='Already a customer? Sign In']")
	public WebElement Signin;

	@AndroidFindBy(xpath = "//android.widget.EditText[@index='1']")
	public WebElement email;

	@AndroidFindBy(xpath = "//android.widget.Button[@text='Continue']")
	public WebElement continu;
	
	@AndroidFindBy(xpath = "//android.widget.EditText[@index='1']")
	public WebElement password;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@text='Login']")
	public WebElement login;

	@AndroidFindBy(id = "in.amazon.mShop.android.shopping:id/action_bar_burger_icon")
	public WebElement action_bar_burger_icon;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Settings']")
	public WebElement Settings;

	
}
