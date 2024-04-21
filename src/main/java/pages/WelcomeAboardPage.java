package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomeAboardPage extends BasePage {

    @FindBy(xpath = "//android.widget.TextView[@text=\"Start using Trust Wallet\"]")
    private WebElement startUsingWalletButton;
    
    @FindBy(xpath = "//android.widget.TextView[@text=\"Home\"]")
    private WebElement homelbl;

    public WelcomeAboardPage(AppiumDriver driver) {
        super();
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void startUsingWallet() {
        startUsingWalletButton.click();
    }
}
