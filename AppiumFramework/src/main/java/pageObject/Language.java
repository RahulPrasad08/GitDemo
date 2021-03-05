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

public class Language {

	public Language(AppiumDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	@AndroidFindBy(xpath = "//android.widget.Button[@text='Skip sign in']")
	public WebElement skipSignIn;

	@AndroidFindBy(id = "in.amazon.mShop.android.shopping:id/action_bar_burger_icon")
	public WebElement action_bar_burger_icon;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Language']")
	public WebElement Language;
	
	@AndroidFindBy(id = "language-options-opt-0")
	public WebElement preffered_Language;
	
}
