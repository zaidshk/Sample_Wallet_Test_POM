package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;



public class RestoreBitcoinPhrase extends BasePage {
	
    @FindBy(xpath = "//android.widget.ScrollView/android.widget.EditText[2]")
    private WebElement phrasefield;
    
    @FindBy(xpath = "//android.widget.TextView[@text=\"Restore wallet\"]")
    private WebElement restorebtn;
    


    public RestoreBitcoinPhrase(AppiumDriver driver) {
        super();
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void enterphrase(String[] phrase) {
    	phrasefield.sendKeys(phrase);
    	driver.navigate().back();
    	restorebtn.click();


    }

}
