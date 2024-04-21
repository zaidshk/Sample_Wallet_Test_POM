package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BackupPage extends BasePage {

    @FindBy(xpath = "//android.widget.TextView[@text=\"Back up manually\"]")
    private WebElement backUpManuallybtn;
    
    @FindBy(xpath = "//android.widget.TextView[@text=\"Create passcode\"]")
    private WebElement createPasslbl;
    
    @FindBy(xpath = "//android.widget.TextView[@text=\"This secret phrase is the master key to your wallet\"]")
    private WebElement secretKeyLabel;
    
    @FindBy(xpath = "//android.widget.TextView[@text=\"SKIP\"]")
    private WebElement skipbtn;

    public BackupPage(AppiumDriver driver) {
        super();
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void clickBackupManually() {
    	backUpManuallybtn.click();
    	
    	
    }
    
    public void clickSkipbtn() {
    	skipbtn.click();
    }
}
