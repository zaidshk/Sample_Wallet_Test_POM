package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GetStartedPage extends BasePage {

    @FindBy(xpath = "//android.widget.TextView[@text=\"Get Started\"]")
    private WebElement getStartedButton;
    
    @FindBy(xpath = "//android.widget.TextView[@text=\"Create new wallet\"]")
    private WebElement createNewWalletbtn;

    public GetStartedPage(AppiumDriver driver) {
        super();
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
    
    public void refreshElements() {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void clickAndGetStarted() {
        getStartedButton.click();
    }
}
