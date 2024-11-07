package utils;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Driver {
    private static AndroidDriver appiumDriver;
    private static IOSDriver iosDriver;

    //bunlarla isimiz yok, sil
    static final String TELEFONADI="Pixel 4 Y";
    static final String ANDROIDVERSION="11.0";
    static final String PLATFORM="Android";
    static final String OTOMASYON_ISMI="UiAutomator2";


    public static AndroidDriver getAndroidDriver()  {
        URL appiumServerURL = null;
        try {
            appiumServerURL = new URL("http://127.0.0.1:4723/");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        if (appiumDriver == null) {

           UiAutomator2Options options=new UiAutomator2Options();
           options.setDeviceName("Pixel 4")
                   .setPlatformName("Android")
                   .setPlatformVersion("10.0")
                   .setAutomationName("UiAutomator2")
                   .setApp("C:\\Users\\Elif Kesen\\IdeaProjects\\T144_ApiumNewVersion\\Apps\\Teknosa – Alisveris, Teknoloji_7.2.6_APKPure.apk");


            if (ConfigReader.getProperty("platformName").equals("Android")) {

                assert appiumServerURL != null;
                appiumDriver = new AndroidDriver(appiumServerURL,options);
                appiumDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
            }else {

                assert appiumServerURL != null;
                iosDriver = new IOSDriver(appiumServerURL,options);
                iosDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

                throw new UnsupportedOperationException("Cihaz IOS");

            }

        }

        return appiumDriver;
    }


    public static void quitAppiumDriver(){
        if (appiumDriver != null) {
            //appiumDriver.closeApp();
            appiumDriver.quit();
            appiumDriver = null;
        }
    }
}
