package pagesAndroid;

import framework.BasePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import java.net.MalformedURLException;
import java.util.List;

public class RegistrationPagesAndroid extends BasePage {

    //titles of registration flows 2 and 3
    @AndroidFindBy(id="net.funmiles.app.mobile:id/title")
    public List<MobileElement> titlesFlows_2_3;

    //Registration flow1
    @AndroidFindBy(xpath="//*[@text='Step 2 of 2']")
    public MobileElement stepText;
    @AndroidFindBy(id="net.funmiles.app.mobile:id/tv_register_step2_title")
    public MobileElement topTest1;
    @AndroidFindBy(id="net.funmiles.app.mobile:id/tv_register_step2_subtitle")
    public MobileElement topText2;
    @AndroidFindBy(xpath="//android.widget.FrameLayout[2]//android.widget.TextView")
    public MobileElement usernameTitle;
    @AndroidFindBy(xpath="//android.widget.FrameLayout[2]//android.widget.EditText")
    public MobileElement usernameInput;
    @AndroidFindBy(xpath="//android.widget.FrameLayout[2]//android.widget.ImageView")
    public MobileElement checkedMarkUsername;
    @AndroidFindBy(xpath="//android.widget.FrameLayout[3]//android.widget.TextView")
    public MobileElement passwordTitle;
    @AndroidFindBy(xpath="//android.widget.FrameLayout[3]//android.widget.EditText")
    public MobileElement passwordInput;
    @AndroidFindBy(xpath="//android.widget.FrameLayout[3]//android.widget.ImageView")
    public MobileElement checkedMarkPassword;
    @AndroidFindBy(xpath="//android.widget.ScrollView/android.view.ViewGroup/android.widget.TextView[1]")
    public MobileElement passwordHelpText;
    @AndroidFindBy(xpath="//android.widget.ScrollView/android.view.ViewGroup/android.widget.TextView[2]")
    public MobileElement maleOption;
    @AndroidFindBy(xpath="//android.widget.ScrollView/android.view.ViewGroup/android.widget.TextView[3]")
    public MobileElement femaleOption;
    @AndroidFindBy(xpath="//android.widget.FrameLayout[6]//android.widget.TextView")
    public MobileElement firstNameTitle;
    @AndroidFindBy(xpath="//android.widget.FrameLayout[6]//android.widget.EditText")
    public MobileElement firstNameInput;

  /*  @AndroidFindBy(xpath="")
    public MobileElement suffixTitle;
    @AndroidFindBy(xpath="")
    public MobileElement suffixInput;
    @AndroidFindBy(xpath="")
    public MobileElement lastNameTitle;
    @AndroidFindBy(xpath="")
    public MobileElement lastNameInput;
    @AndroidFindBy(xpath="")
    public MobileElement birthdayTitle;
    @AndroidFindBy(xpath="")
    public MobileElement birthdayInput;
    @AndroidFindBy(xpath="")
    public MobileElement phoneTitle;
    @AndroidFindBy(xpath="")
    public MobileElement phoneInput;
    @AndroidFindBy(xpath="")
    public MobileElement emailTitle;
    @AndroidFindBy(xpath="")
    public MobileElement emailImput;
    @AndroidFindBy(xpath="")
    public MobileElement submitButton; */
}
