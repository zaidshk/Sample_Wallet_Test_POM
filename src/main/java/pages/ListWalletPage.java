package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ListWalletPage extends BasePage {
    
    @FindBy(xpath = "//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[1]/android.widget.Button")
    private WebElement addbtn;
    
    @FindBy(xpath = "//android.widget.TextView[@text=\"Create new wallet\"]")
    private WebElement createWalletbtn;
    
    @FindBy(xpath = "//android.widget.TextView[@text=\"Main Wallet 2\"]")
    private WebElement secondWallet;
    
    @FindBy(xpath = "//android.widget.TextView[@text=\"bc1qmdyk368q…tr8ugdgunxg\"]")
    private WebElement bitCoin;

    public ListWalletPage(AppiumDriver driver) {
        super();
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
    
    
    public void createWallet() {
    	addbtn.click();
    	createWalletbtn.click();
    }
    

    public boolean wallet2() {
return secondWallet.isDisplayed();
    }
    
    public boolean bitCoinWallet() {
return bitCoin.isDisplayed();
    }
}
