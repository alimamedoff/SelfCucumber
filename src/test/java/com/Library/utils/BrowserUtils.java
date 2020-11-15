package com.Library.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BrowserUtils {

    public static void wait(int secs) {
        try {
            Thread.sleep(1000 * secs);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /*
     * switches to new window by the exact title
     * returns to original window if windows with given title not found
     */


    public static List<String> getElementsText(List<WebElement> list){
        List<String> elementTexts = new ArrayList<>();
        for (WebElement el : list ){
            elementTexts.add(el.getText());
        }
        return elementTexts;
    }

    public static List<String> getElementsText(By locator) {

        List<WebElement> elems = Driver.getDriver().findElements(locator);
        List<String> elemTexts = new ArrayList<>();

        for (WebElement el : elems) {
            elemTexts.add(el.getText());
        }
        return elemTexts;
    }







}
