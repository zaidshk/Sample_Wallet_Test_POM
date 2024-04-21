package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


//Backup confirmation screen
public class BackupConfirmationPage extends BasePage {

    @FindBy(xpath = "//android.widget.ScrollView/android.view.View[1]")
    private WebElement agreeButton1;
    
    @FindBy(xpath = "//android.widget.ScrollView/android.view.View[2]")
    private WebElement agreeButton2;
    
    @FindBy(xpath = "//android.widget.ScrollView/android.view.View[3]")
    private WebElement agreeButton3;

    @FindBy(xpath = "//android.widget.TextView[@text=\"Continue\"]")
    private WebElement continueButton;
    
    @FindBy(xpath = "//android.widget.TextView[@text=\"Secret phrase\"]")
    private WebElement securePhrasePage;

    public BackupConfirmationPage(AppiumDriver driver) {
        super();
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public boolean clickAndAgreeContinue() {
        agreeButton1.click();
        agreeButton2.click();
        agreeButton3.click();
        continueButton.click();
        return securePhrasePage.isDisplayed();
    }
}
