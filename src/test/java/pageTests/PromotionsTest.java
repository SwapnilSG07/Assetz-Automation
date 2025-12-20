package pageTests;

import java.time.Duration;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import pageObjects.PromotionsPage;
import testUtils.BaseTest;
import utils.AppiumUtils;

public class PromotionsTest extends BaseTest {

	public PromotionsTest() {
		super();
	}

	public void ValidatePromotions() throws InterruptedException {

		PromotionsPage promotions = new PromotionsPage(driver);
		promotions.clickOnMenuButton();
		promotions.ClickOnPromotionButton();
		Thread.sleep(2000);
		promotions.validatePromotionTextContains("Promotion");
		

	}

}
