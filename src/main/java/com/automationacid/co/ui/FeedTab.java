package com.automationacid.co.ui;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FeedTab {
    public static final Target LBL_YOUR_FEED = Target.the("Tab your feed")
            .locatedForAndroid(AppiumBy.xpath("//android.widget.TextView[@text='Your feed']"))
            .locatedForIOS(By.xpath(""));

}
