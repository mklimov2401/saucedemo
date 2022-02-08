package pageObjects;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

public class LoginPageObject {


    public final SelenideElement userName = Selenide.$(By.xpath(".//input[@id='user-name']"));
    public final SelenideElement password = Selenide.$(By.xpath(".//input[@id='password']"));
    public final SelenideElement loginButton = Selenide.$(By.xpath(".//input[@id='login-button']"));
    public final SelenideElement error = Selenide.$(".error-message-container");
}
