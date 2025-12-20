package pageObjects;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import utils.AppiumUtils;

public class Scan extends AppiumUtils {

	private AndroidDriver driver;
	private WebDriverWait wait;
	private AppiumUtils utils;

	// ✅ Constructor-----------------------------------------------

	public Scan(AndroidDriver driver) {
		this.driver = driver;
		this.utils = new AppiumUtils(driver);
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(10)), this);
	}

	// ✅ Page Objects using @AndroidFindBy---------------------------

	@AndroidFindBy(xpath = "")
	private WebElement scanBtn;

	@AndroidFindBy(xpath = "")
	private WebElement scanpageTitle;

	@AndroidFindBy(xpath = "")
	private WebElement howToScanCouponBtn;

	@AndroidFindBy(xpath = "")
	private WebElement checkHowToScanCouponText;

	@AndroidFindBy(xpath = "")
	private WebElement enterCouponNo;

	@AndroidFindBy(xpath = "")
	private WebElement addBtn;

	@AndroidFindBy(xpath = "")
	private WebElement totalCommulativePoints;

	@AndroidFindBy(xpath = "")
	private WebElement pointsDismissBtn;

	@AndroidFindBy(xpath = "")
	private WebElement pointsAddBtn;

	@AndroidFindBy(xpath = "")
	private WebElement errorText;

	@AndroidFindBy(xpath = "")
	private WebElement errorOkBtn;

}
