package pageObjects;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import utils.AppiumUtils;

public class ViewProfilePage extends AppiumUtils {

	private AndroidDriver driver;
	private WebDriverWait wait;
	private AppiumUtils utils;

	// ✅ Constructor-----------------------------------------------

	public ViewProfilePage(AndroidDriver driver) {
		this.driver = driver;
		this.utils = new AppiumUtils(driver);
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(10)), this);
	}

	// ✅ Page Objects using @AndroidFindBy---------------------------

	@AndroidFindBy(xpath = "")
	private WebElement myProfileBtn;

	@AndroidFindBy(xpath = "")
	private WebElement verifyProfileRedirectedPage;

	@AndroidFindBy(xpath = "")
	private WebElement verifyMobileNumber;

	@AndroidFindBy(xpath = "")
	private WebElement emailAddressBtn;

	@AndroidFindBy(xpath = "")
	private WebElement emailPagetitle;

	@AndroidFindBy(xpath = "")
	private WebElement currentEmailAddress;

	@AndroidFindBy(xpath = "")
	private WebElement newEmailAddress;

	@AndroidFindBy(xpath = "")
	private WebElement sendVerificationLink;

	@AndroidFindBy(xpath = "")
	private WebElement updateEmailBtn;

	@AndroidFindBy(xpath = "")
	private WebElement checkEmailStatus;

	@AndroidFindBy(xpath = "")
	private WebElement checkKYCStausBeforeUdpate;

	@AndroidFindBy(xpath = "")
	private WebElement kycBtn;

	@AndroidFindBy(xpath = "")
	private WebElement kycPageTitle;

}
