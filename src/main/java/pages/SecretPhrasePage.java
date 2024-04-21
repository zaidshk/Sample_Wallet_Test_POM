package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.ArrayList;
import java.util.List;

public class SecretPhrasePage extends BasePage {

    private AppiumDriver driver;

    @FindBy(xpath = "//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[5]/android.widget.Button")
    private WebElement continueButton;

    @FindBy(xpath = "//android.widget.TextView[@text=\"Copy to Clipboard\"]")
    private WebElement copyPhrase;

    public static List<String> PHRASES = new ArrayList<>();

    public SecretPhrasePage(AppiumDriver driver) {
        super();
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void retrieveAndContinue() {
	    copyPhrase.click();
	    continueButton.click();
	   
    
}
}