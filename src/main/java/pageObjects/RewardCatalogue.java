package pageObjects;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import utils.AppiumUtils;

public class RewardCatalogue extends AppiumUtils {

	private AndroidDriver driver;
	private WebDriverWait wait;
	private AppiumUtils utils;

	// ✅ Constructor-----------------------------------------------
	
	public RewardCatalogue(AndroidDriver driver) {
		this.driver = driver;
		this.utils = new AppiumUtils(driver);
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(10)), this);
	}

	// ✅ Page Objects using @AndroidFindBy---------------------------

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Rewards']")
	private WebElement rewardBtn;
	
	@AndroidFindBy(xpath="")
	private WebElement verifyRedirectedRewardsPage;
	
	@AndroidFindBy(xpath="")
	private WebElement clickfilterBtn;
	
	@AndroidFindBy(xpath="")
	private WebElement verifyFilterCategoriesPage;
	
	@AndroidFindBy(xpath="")
	private WebElement exploreProd;
	
	@AndroidFindBy(xpath="")
	private WebElement selectItem;
	
	@AndroidFindBy(xpath="")
	private WebElement applyButton;
	
	@AndroidFindBy(xpath="")
	private WebElement resetBtn;
	
	@AndroidFindBy(xpath="")
	private WebElement filteredProd;
	
	@AndroidFindBy(xpath="")
	private WebElement searchOption;
	
	
	//Methods-----------------------------------------------

}
