package pagesAndroid;

import framework.BasePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class ProfilePageAndroid extends BasePage {

    @AndroidFindBy(id="net.funmiles.app.mobile:id/myCardTitle")
    public MobileElement myCardTitle;

}
