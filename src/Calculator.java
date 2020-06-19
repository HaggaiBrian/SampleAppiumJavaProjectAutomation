import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Calculator {

    private AndroidDriver driver;

    @Before
    public void setUp() throws MalformedURLException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("platformVersion", "7.0");
        desiredCapabilities.setCapability("appPackage", "com.android.calculator2");
        desiredCapabilities.setCapability("deviceName", "6TN799YTLJY5PFLN");
        desiredCapabilities.setCapability("appActivity", "com.android.calculator2.Calculator");

        URL remoteUrl = new URL("http://localhost:4723/wd/hub");

        driver = new AndroidDriver(remoteUrl, desiredCapabilities);
    }

    @Test
    public void calculator() {
        MobileElement el1 = (MobileElement) driver.findElementById("com.android.calculator2:id/digit_7");
        el1.click();
        MobileElement el2 = (MobileElement) driver.findElementByAccessibilityId("plus");
        el2.click();
        MobileElement el3 = (MobileElement) driver.findElementById("com.android.calculator2:id/digit_3");
        el3.click();
        MobileElement el4 = (MobileElement) driver.findElementByAccessibilityId("equals");
        el4.click();
        String el5 = driver.findElementById("com.android.calculator2:id/result").getText();

        if (el5.equals("10"))
        {
            System.out.println("Test is Successful...");
        }
        else
            {
                System.out.println("Test Failed...");
            }
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
