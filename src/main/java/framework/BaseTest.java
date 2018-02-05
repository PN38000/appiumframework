package framework;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.testng.annotations.BeforeSuite;
import java.io.File;


public class BaseTest {

    private static AppiumServiceBuilder service;

    public BaseTest(){
        System.out.println("Trying to start Appium Server!");
        service = new AppiumServiceBuilder().usingDriverExecutable(new File("/usr/local/bin/node")).
                withAppiumJS(new File("/Applications/Appium.app/Contents/Resources/app/node_modules/appium/build/lib/main.js"));
        service.build().start();
        System.out.println("Appium Server is at your service!");

    }
}
