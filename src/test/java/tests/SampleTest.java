package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import pages.*;

public class SampleTest extends BaseTest {
	
    private GetStartedPage getStartedPage;
    private BackupPage backupPage;
    private CreatePasscodePage createPasscodePage;
    private WelcomeAboardPage welcomeAboardPage;
    private HomePage homepage;
    private ListWalletPage listWallet;
    private CreateWalletPage createWalletPage;
     private AdExistingWalletPage addexistingwallet;
     private SelectNetworkPage  selectNetworkPage;
     private RestoreBitcoinPhrase  restoreBitcoinPhrase;
     public static String[] Bitcoinphrase= {"Alley ", "ticket ", "tent ", "service ", "unknown ", "airport ", "review ", "decide ", "save ", "tourist ", "empty ", "sample "}; //should be handled securely in a  config file
    
    
     //Initializing all classes and Driver before running the Tests
    @BeforeMethod
    public void setUp() {
        super.setUp(); //initializing parent class driver
        getStartedPage = new GetStartedPage(driver);
        backupPage = new BackupPage(driver);
        new BackupConfirmationPage(driver);
        new SecretPhrasePage(driver);
        new ConfirmSecretPhrasePage(driver);
        createPasscodePage = new CreatePasscodePage(driver);
        welcomeAboardPage = new WelcomeAboardPage(driver);
        homepage = new HomePage(driver);
        createWalletPage = new CreateWalletPage (driver);
        listWallet = new ListWalletPage(driver);
        addexistingwallet = new AdExistingWalletPage (driver);
        selectNetworkPage = new SelectNetworkPage (driver);
        restoreBitcoinPhrase = new RestoreBitcoinPhrase (driver);
    }
    


    //Test method to create a Wallet E2E
    @Test(description = "E2E test for wallet creation scenario with No backup")
    public void walletCreationSkipBackupTest() {
       getStartedPage.clickAndGetStarted();
       createWalletPage.createNewWallet();
        backupPage.clickSkipbtn();
        createPasscodePage.createAndVerifyPasscode();
        createPasscodePage.confirmPasscode();
        welcomeAboardPage.startUsingWallet();
        Assert.assertTrue(homepage.homeScreenDisplayed(), "Failed Adding wallet from Create Wallet option");
        
    }
    
    //Test method to create a wallet from inside the app 
    @Test(description = "Create second wallet from the app")
    public void walletCreationInAppTest() {
       getStartedPage.clickAndGetStarted();
       createWalletPage.createNewWallet();
        backupPage.clickSkipbtn();
        createPasscodePage.createAndVerifyPasscode();
        createPasscodePage.confirmPasscode();
        welcomeAboardPage.startUsingWallet();
        homepage.mainWalletbtn();
        listWallet.createWallet();
        backupPage.clickSkipbtn();
        welcomeAboardPage.startUsingWallet();
        homepage.mainWalletbtn();
        Assert.assertTrue(listWallet.wallet2(), "Failed adding wallet from In App");
        
    }
    
    //Test method to create an existing wallet for Bitcoin using SecurePhrase
    @Test(description = "Add existing Wallet for Bitcoin")
    public void walletCreationExistingBitcoinTest() {
       getStartedPage.clickAndGetStarted();
       createWalletPage.addExistingWallet();
       addexistingwallet.clickSecretPhrase();
       selectNetworkPage.selectBitcoin();
       restoreBitcoinPhrase.enterphrase(Bitcoinphrase);
       createPasscodePage.createAndVerifyPasscode();
       createPasscodePage.confirmPasscode();
       welcomeAboardPage.startUsingWallet();
       homepage.mainWalletbtn();
       Assert.assertTrue(listWallet.bitCoinWallet(), "Failed adding Existing Wallet");
    }
    
    // More test can be added for Creating wallet with Manual backup, google drive, and other more existing wallets like Bitcoin
    
    
    //Closing the Driver
    @AfterMethod
    public void teardown(ITestResult result) {
    	this.driver.quit();
    }
    

}
