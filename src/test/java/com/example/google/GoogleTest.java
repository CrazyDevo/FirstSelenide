package com.example.google;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import com.example.firstselenide.MainPage;
import io.qameta.allure.selenide.AllureSelenide;
import io.qameta.allure.selenide.LogType;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.logging.LoggingPreferences;

import java.util.List;
import java.util.logging.Level;

import static com.codeborne.selenide.Selenide.*;

public class GoogleTest {
 GooglePage googlePage=new GooglePage();

    @BeforeAll
    public static void setUpAll() {
        Configuration.browserSize = "1280x800";
        Configuration.browser="chrome";
        Configuration.headless=false;
  //      Configuration.baseUrl="https://www.google.com/";
        SelenideLogger.addListener("allure", new AllureSelenide());
    }

    @BeforeEach
    public void setUp() {
        open(Configuration.baseUrl);
    }
    @Test
    public void test1(){
        googlePage.searchText.sendKeys("Eto"+ Keys.ENTER);
        List<String> webDriverLogs = getWebDriverLogs(String.valueOf(LogType.BROWSER), Level.ALL);
        // LoggingPreferences logPrefs = new LoggingPreferences();
        //logPrefs.enable(String.valueOf(LogType.BROWSER), Level.ALL);
        //logPrefs.enable(String.valueOf(LogType.PERFORMANCE), Level.ALL);
        System.out.println("======================");
        System.out.println(webDriverLogs);

    }


}
