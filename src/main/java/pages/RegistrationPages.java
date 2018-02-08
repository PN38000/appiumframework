package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class RegistrationPages {

    AppiumDriver driver;
    public RegistrationPages(AppiumDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    //titles of registration flows 2 and 3
    @AndroidFindBy(id="net.funmiles.app.mobile:id/title")
    @iOSFindBy(xpath = "//XCUIElementTypeOther[1]/XCUIElementTypeStaticText")
    public List<MobileElement> titlesFlows_2_3;

    @iOSFindBy(accessibility = "backButton")
    public List<MobileElement> backIconIos;

    //Registration flow1
    @AndroidFindBy(xpath="//*[@text='Step 2 of 2']")
   // @iOSFindBy(xpath = "")
    public MobileElement stepText;

    @AndroidFindBy(id="net.funmiles.app.mobile:id/tv_register_step2_title")
    @iOSFindBy(xpath = "//XCUIElementTypeOther[1]/XCUIElementTypeStaticText[1]")
    public MobileElement topTest1;

    @AndroidFindBy(id="net.funmiles.app.mobile:id/tv_register_step2_subtitle")
  //  @iOSFindBy(xpath = "")
    public MobileElement topText2;

    @AndroidFindBy(xpath="//android.widget.FrameLayout[2]//android.widget.EditText")
  //  @iOSFindBy(xpath = "")
    public MobileElement usernameInput;

    @AndroidFindBy(xpath="//android.widget.FrameLayout[2]//android.widget.ImageView")
   // @iOSFindBy(xpath = "")
    public MobileElement checkedMarkUsername;

    @AndroidFindBy(xpath="//android.widget.FrameLayout[3]//android.widget.EditText")
  //  @iOSFindBy(xpath = "")
    public MobileElement passwordInput;

    @AndroidFindBy(xpath="//android.widget.FrameLayout[3]//android.widget.ImageView")
   // @iOSFindBy(xpath = "")
    public MobileElement checkedMarkPassword;

    @AndroidFindBy(xpath="//android.widget.ScrollView/android.view.ViewGroup/android.widget.TextView[1]")
  //  @iOSFindBy(xpath = "")
    public MobileElement passwordHelpText;

    @AndroidFindBy(xpath="//android.widget.ScrollView/android.view.ViewGroup/android.widget.TextView[2]")
  //  @iOSFindBy(xpath = "")
    public MobileElement maleOption;

    @AndroidFindBy(xpath="//android.widget.ScrollView/android.view.ViewGroup/android.widget.TextView[3]")
  //  @iOSFindBy(xpath = "")
    public MobileElement femaleOption;

    @AndroidFindBy(xpath="//android.widget.FrameLayout[6]//android.widget.EditText")
   // @iOSFindBy(xpath = "")
    public MobileElement firstNameInput;


    /* @AndroidFindBy(xpath="")
    @iOSFindBy(xpath = "")
    public MobileElement suffixInput;

    @AndroidFindBy(xpath="")
    @iOSFindBy(xpath = "")
    public MobileElement lastNameInput;

    @AndroidFindBy(xpath="")
    @iOSFindBy(xpath = "")
    public MobileElement birthdayInput;

    @AndroidFindBy(xpath="")
    @iOSFindBy(xpath = "")
    public MobileElement phoneInput;

    @AndroidFindBy(xpath="")
    @iOSFindBy(xpath = "")
    public MobileElement emailImput;

    @AndroidFindBy(xpath="")
    @iOSFindBy(xpath = "")
    public MobileElement submitButton; */
}
