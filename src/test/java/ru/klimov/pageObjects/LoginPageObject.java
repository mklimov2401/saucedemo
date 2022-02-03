package ru.klimov.pageObjects;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LoginPageObject {


    public final SelenideElement userName = $(By.xpath(".//input[@id='user-name']"));
    public final SelenideElement password = $(By.xpath(".//input[@id='password']"));
    public final SelenideElement loginButton = $(By.xpath(".//input[@id='login-button']"));
}
