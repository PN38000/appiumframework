package pagesAndroid;

import framework.BasePageAndroid;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class ProfilePageAndroid extends BasePageAndroid {

    @AndroidFindBy(id="net.funmiles.app.mobile:id/myCardTitle")
    public MobileElement myCardTitle;

}
