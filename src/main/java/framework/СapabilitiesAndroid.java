package framework;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

import org.openqa.selenium.remote.DesiredCapabilities;


import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class СapabilitiesAndroid {

    public static AndroidDriver<AndroidElement> capatibilities() throws MalformedURLException {

// TODO Auto-generated method stub
        File appDir = new File("src");
        File app = new File(appDir, "Fun Miles_1.3.105-stage-release.apk");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"Demo3" );
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android" );
        capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
        capabilities.setCapability("newCommandTimeout", 60);
        capabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "net.funmiles.app.mobile");
        capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "net.funmiles.app.mobile.feature.onboarding.OnboardingActivity");
        AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        return driver;
    }
}
