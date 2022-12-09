package com.example.google;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class GooglePage {


    public SelenideElement searchText=$x("//input[@name='q']");

    public SelenideElement inputGoogle= $x("//input[@data-ved='0ahUKEwjGnufC9-z7AhVRQvEDHcI7DxwQ4dUDCA0']");


    

}
