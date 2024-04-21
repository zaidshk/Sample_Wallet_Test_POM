package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class HomePage extends BasePage {

    @FindBy(xpath = "//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[5]")
    private WebElement mainWalletbtn;
    
    @FindBy(xpath = "//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[1]/android.widget.Button")
    private WebElement addbtn;

    @FindBy(xpath = "//android.widget.TextView[@text=\"Create new wallet\"]")
    private WebElement createWalletbtn;
    
    @FindBy(xpath = "//android.widget.TextView[@text=\"SKIP\"]")
    private WebElement skipbtn;
    
    @FindBy(xpath = "//android.widget.TextView[@text=\"Add existing wallet\"]")
    private WebElement existingWalletbtn;
    
    @FindBy(xpath = "//android.widget.TextView[@text=\"Secret phrase\"]")
    private WebElement secretPhrasebtn;
    
    @FindBy(xpath = "//android.widget.TextView[@text=\"Bitcoin\"]")
    private WebElement bitCoin;
    
    @FindBy(xpath = "//android.widget.ScrollView/android.widget.EditText[2]")
    private WebElement phraseField;
    
    @FindBy(xpath = "//android.widget.TextView[@text=\"Start using Trust Wallet\"]")
    private WebElement starUsingTrustWalletButton;
    
    @FindBy(xpath = "(//android.widget.TextView[@text=\"Home\"])[1]")
    private WebElement homelbl;
    
    
    
    public HomePage(AppiumDriver driver) {
        super();
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void mainWalletbtn() {
    	mainWalletbtn.click();
    }
    
    
    public boolean homeScreenDisplayed() {
    	return homelbl.isDisplayed();
    }
}
