package pagesAndroid;

import framework.BasePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class SettingsPageAndroid extends BasePage {

    @AndroidFindBy(id="net.funmiles.app.mobile:id/tv_settings_title")
    public MobileElement pageTitle;
    @AndroidFindBy(id="net.funmiles.app.mobile:id/textView2")
    public MobileElement optionsTitle;
    @AndroidFindBy(id="\tnet.funmiles.app.mobile:id/tv_settings_lang_title")
    public MobileElement languageTitle;
    @AndroidFindBy(id="net.funmiles.app.mobile:id/iv_settings_lang_icon")
    public MobileElement languageIcon;
    @AndroidFindBy(id="net.funmiles.app.mobile:id/tv_settings_lang_name")
    public MobileElement languageName;
    @AndroidFindBy(xpath="//android.widget.ImageView[2]")
    public MobileElement languageArrowIcon;
    @AndroidFindBy(id="net.funmiles.app.mobile:id/tv_settings_island_title")
    public MobileElement islandTitle;
    @AndroidFindBy(id="net.funmiles.app.mobile:id/tv_settings_island_name")
    public MobileElement islandName;
    @AndroidFindBy(xpath="//android.widget.FrameLayout[3]//android.widget.ImageView")
    public MobileElement islandArrowIcon;
    @AndroidFindBy(id="net.funmiles.app.mobile:id/textView3")
    public MobileElement functionalitiesTitle;
    @AndroidFindBy(id="net.funmiles.app.mobile:id/tv_settings_location_title")
    public MobileElement locationTtile;
    @AndroidFindBy(id="net.funmiles.app.mobile:id/tv_settings_location_status")
    public MobileElement locationState;
    @AndroidFindBy(id="net.funmiles.app.mobile:id/sw_settings_location")
    public MobileElement locationSwitch;
    @AndroidFindBy(id="net.funmiles.app.mobile:id/tv_settings_push_title")
    public MobileElement notificationTtile;
    @AndroidFindBy(id="net.funmiles.app.mobile:id/tv_settings_push_status")
    public MobileElement notificationState;
    @AndroidFindBy(id="net.funmiles.app.mobile:id/sw_settings_location")
    public MobileElement notificationSwitch;
    @AndroidFindBy(id="net.funmiles.app.mobile:id/tv_settings_app_version")
    public MobileElement appVersion;

}
