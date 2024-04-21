package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConfirmSecretPhrasePage extends BasePage {
	

    
    @FindBy(xpath = "//android.widget.ScrollView/android.view.View[3]")
    private WebElement continuebtn;
    
    @FindBy(xpath = "//android.widget.TextView[@text=\"Secret phrase\"]")
    private WebElement securePhraselbl;

    public ConfirmSecretPhrasePage(AppiumDriver driver) {
        super();
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public boolean confirmAndContinue() {

       continuebtn.click();
        return securePhraselbl.isDisplayed();
    }
}
