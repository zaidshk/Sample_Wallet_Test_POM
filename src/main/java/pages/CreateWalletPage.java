package pages;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class CreateWalletPage extends BasePage {
    
    @FindBy(xpath = "//android.widget.TextView[@text=\"Create new wallet\"]")
    private WebElement createNewWalletbtn;
    
    @FindBy(xpath = "//android.widget.TextView[@text=\"Add existing wallet\"]")
    private WebElement existingWallet;

    public CreateWalletPage(AppiumDriver driver) {
        super();
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
    
    public void refreshElements() {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void createNewWallet() {
        try {
        	 createNewWalletbtn.click();
        } catch (StaleElementReferenceException e) {// Handled stale element exception
            refreshElements();
             createNewWalletbtn.click();
        }
    }
    
    public void addExistingWallet() {
        try {
        	 existingWallet.click();
        } catch (StaleElementReferenceException e) { // Handled stale element exception
            refreshElements();
             existingWallet.click();
        }
    }
}
