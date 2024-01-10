package utils;

import org.openqa.selenium.JavascriptExecutor;

public class JSUtils {

    public static JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

    public static void executeJavaScript(String script){
        js.executeScript(script);
    }
}
