package com.automationacid.co.ui;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomeConduitPage {
    public static final Target LNK_TABS = Target.the("Link tags")
            .locatedForAndroid(AppiumBy.xpath("//*[@text='Tags']"))
            .locatedForIOS(By.xpath(""));

    public static final Target BTN_GO_LOGIN = Target.the("Ir a log in")
            .locatedForAndroid(AppiumBy.xpath("//*[@content-desc='Login, tab, 2 of 2']"))
            .locatedForIOS(By.xpath(""));


 }
