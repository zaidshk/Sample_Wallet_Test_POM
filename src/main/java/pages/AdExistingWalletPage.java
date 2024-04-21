package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

//AddExisting wallet screen
public class AdExistingWalletPage extends BasePage {

    @FindBy(xpath = "//android.widget.TextView[@text=\"Secret phrase\"]")
    private WebElement secretPhrasebtn;
   

    public AdExistingWalletPage(AppiumDriver driver) {
        super();
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void clickSecretPhrase() {
    	secretPhrasebtn.click();

    }
    
}
