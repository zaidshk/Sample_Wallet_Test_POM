package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

public class CreatePasscodePage extends BasePage {
	
	
    @FindBy(xpath = "//android.widget.TextView[@text=\"Create passcode\"]")
    private WebElement createPasslbl;
    
    @FindBy(xpath = "//android.widget.TextView[@text=\"1\"]")
    private WebElement keypad1;
    
    @FindBy(xpath = "//android.widget.TextView[@text=\"Confirm passcode\"]")
    private WebElement confirmPasslbl;
    
    @FindBy(xpath = "//android.widget.TextView[@text=\"Start using Trust Wallet\"]")
    private WebElement starUsingTrustWalletButton;

    public CreatePasscodePage(AppiumDriver driver) {
        super();
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void createAndVerifyPasscode() {
    	createPasslbl.isDisplayed();
        for (int i = 0; i < 6; i++) {  // Simulate tapping a digit 6 times
        	keypad1.click();
        }
    }

    public void confirmPasscode() {
        for (int i = 0; i < 6; i++) {  // Confirm by tapping the same digit 6 times
            keypad1.click();
        }
       
    }
}
