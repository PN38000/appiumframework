package framework;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import java.net.MalformedURLException;

import static framework.СapabilitiesAndroid.capatibilities;

public class BasePageAndroid {

    public static AndroidDriver driver;

    static {
        try {
            driver = capatibilities();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    public BasePageAndroid() {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);

    }

}
