package com.automationacid.co.ui;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginConduitPage {

    public static final Target TXT_EMAIL = Target.the("Ingreso de email")
            .locatedForAndroid(AppiumBy.xpath("//android.widget.EditText[@text='Ex: email@dominio.com']"))
            .locatedForIOS(By.xpath(""));
    public static final Target TXT_PASSWORD = Target.the("Ingreso de password")
            .locatedForAndroid(AppiumBy.xpath("//android.widget.EditText[@text='Password']"))
            .locatedForIOS(By.xpath(""));
    public static final Target BTB_SIGN_IN = Target.the("Boton Sing In")
            .locatedForAndroid(AppiumBy.xpath("//android.widget.TextView[@text='Sign In']"))
            .locatedForIOS(By.xpath(""));
    public static final Target LBL_EMAIL_EMPTY = Target.the("Campo email vacio")
            .locatedForAndroid(AppiumBy.xpath("//android.widget.EditText[@text='Ex: email@dominio.com']/..//following-sibling::android.view.ViewGroup[1]//following-sibling::android.widget.TextView[@text='This field is required']"))
            .locatedForIOS(By.xpath(""));

    public static final Target LBL_PASSWORD_EMPTY = Target.the("Campo password vacio")
            .locatedForAndroid(AppiumBy.xpath("//android.widget.EditText[@text='Password']/..//following-sibling::android.view.ViewGroup//*[@text='This field is required']"))
            .locatedForIOS(By.xpath(""));

    public static final Target LBL_ERROR_OCURRED = Target.the("Usuario no existente")
            .locatedForAndroid(AppiumBy.xpath("//*[contains(@text,'An error ocurred.')]"))
            .locatedForIOS(By.xpath(""));


}
