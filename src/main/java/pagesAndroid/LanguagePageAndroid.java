package pagesAndroid;

import framework.BasePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import java.net.MalformedURLException;
import java.util.List;

public class LanguagePageAndroid extends BasePage {


    @AndroidFindBy(xpath="//*[@text='Let’s get started!']")
    public MobileElement topText1;
    @AndroidFindBy(xpath="//*[@text='Please choose your language']")
    public MobileElement topText2;
    @AndroidFindBy(xpath="//android.widget.RelativeLayout/android.widget.TextView")
    public List<MobileElement> language;
    @AndroidFindBy(xpath="//android.widget.ImageView")
    public List<MobileElement> selectedMark;
    @AndroidFindBy(id="net.funmiles.app.mobile:id/next")
    public MobileElement nextButton;

}
