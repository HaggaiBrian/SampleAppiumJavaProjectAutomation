import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DialNumber {

    private AndroidDriver driver;

    @Before
    public void setUp() throws MalformedURLException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("platformVersion", "7.0");
        desiredCapabilities.setCapability("appPackage", "com.android.dialer");
        desiredCapabilities.setCapability("deviceName", "6TN799YTLJY5PFLN");
        desiredCapabilities.setCapability("appActivity", "com.android.dialer.DialtactsActivity");

        URL remoteUrl = new URL("http://localhost:4723/wd/hub");

        driver = new AndroidDriver(remoteUrl, desiredCapabilities);
    }

    @Test
    public void dialnumber() throws InterruptedException {
        MobileElement el1 = (MobileElement) driver.findElementById("com.android.dialer:id/zero");
        el1.click();
        Thread.sleep(1000);
        MobileElement el2 = (MobileElement) driver.findElementById("com.android.dialer:id/seven");
        el2.click();
        Thread.sleep(1000);
        MobileElement el3 = (MobileElement) driver.findElementById("com.android.dialer:id/zero");
        el3.click();
        Thread.sleep(1000);
        MobileElement el4 = (MobileElement) driver.findElementById("com.android.dialer:id/six");
        el4.click();
        Thread.sleep(1000);
        MobileElement el5 = (MobileElement) driver.findElementById("com.android.dialer:id/six");
        el5.click();
        Thread.sleep(1000);
        MobileElement el6 = (MobileElement) driver.findElementById("com.android.dialer:id/five");
        el6.click();
        Thread.sleep(1000);
        MobileElement el7 = (MobileElement) driver.findElementById("com.android.dialer:id/eight");
        el7.click();
        Thread.sleep(1000);
        MobileElement el8 = (MobileElement) driver.findElementById("com.android.dialer:id/four");
        el8.click();
        Thread.sleep(1000);
        MobileElement el9 = (MobileElement) driver.findElementById("com.android.dialer:id/nine");
        el9.click();
        Thread.sleep(1000);
        MobileElement el10 = (MobileElement) driver.findElementById("com.android.dialer:id/nine");
        el10.click();
        Thread.sleep(1000);
        String el11 = driver.findElementById("com.android.dialer:id/digits").getText();
        Thread.sleep(3000);

        if (el11.equals("(070) 665-8499")){
        MobileElement el12 = (MobileElement) driver.findElementById("com.android.dialer:id/dialpad_floating_action_button");
        el12.click();
        Thread.sleep(6000);
        }
        else{
            System.out.println("Test has Failed....");
        }
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
