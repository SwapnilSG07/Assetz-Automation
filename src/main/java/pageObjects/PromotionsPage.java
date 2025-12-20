package pageObjects;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import utils.AppiumUtils;

public class PromotionsPage extends AppiumUtils {

	private AndroidDriver driver;
	private WebDriverWait wait;
	private AppiumUtils utils;

	public PromotionsPage(AndroidDriver driver) {
		this.driver = driver;
		this.utils = new AppiumUtils(driver);
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(10)), this);
	}
	// Page Objects for promotion page

	@AndroidFindBy(xpath = "//android.widget.FrameLayout[@resource-id='android:id/content']/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[12]/android.view.ViewGroup/android.view.ViewGroup[3]")
	private WebElement menuBtn;

	@AndroidFindBy(xpath = "//android.widget.FrameLayout[@resource-id='android:id/content']/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[13]/android.view.ViewGroup/android.view.ViewGroup[3]")
	private WebElement promotionBtnText;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Promotions']")
	private WebElement promotionBtn;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='SKU Banner']")
	private WebElement skuBanner;

	// Methods for promotion page as per the page objects

	public void clickOnMenuButton() {
		menuBtn.click();
		System.out.print("Clicked on the Menu button");
	}

	public void ClickOnPromotionButton() {
		promotionBtn.click();
		System.out.println("Clicked on the Promotion button");
	}

	public void validatePromotionTextContains(String expectedPartialText) {

		String actualText = waitForVisibility(promotionBtnText).getText().trim();

		Assert.assertTrue(actualText.contains(expectedPartialText),
				"Promotion text does not contain expected value. Actual: " + actualText);
		System.out.println("Find out the actual text");
	}

	public void clickSKU() {
		scrollToText("SKU Banner"); // call reusable scroll
		skuBanner.click(); // click after scrolling
		System.out.println("Step: Clicked on SKU Banner");
		scrollToEndAction();

	}

}
