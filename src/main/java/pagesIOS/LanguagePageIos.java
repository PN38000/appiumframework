package pagesIOS;

import framework.BasePageIos;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.iOSFindBy;

import java.util.List;

public class LanguagePageIos extends BasePageIos {

    @iOSFindBy(xpath="//XCUIElementTypeStaticText")
    public List<MobileElement> language;
    @iOSFindBy(accessibility="NEXT")
    public MobileElement nextButton;

    public void allowPermission() throws InterruptedException {
        driver.switchTo().alert().accept();
        Thread.sleep(10000);
        driver.switchTo().alert().accept();
    }

}
