package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class SelectNetworkPage extends BasePage {
	
    @FindBy(xpath = "//android.widget.TextView[@text=\"Bitcoin\"]")
    private WebElement bitCoin;
    
 

    public SelectNetworkPage(AppiumDriver driver) {
        super();
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void selectBitcoin() {
    	bitCoin.click();

    }
    

    
    
}
