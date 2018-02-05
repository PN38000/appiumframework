package pagesAndroid;

import framework.BasePageAndroid;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.util.List;

public class LanguagePageAndroid extends BasePageAndroid {


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
