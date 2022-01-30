package pageObjects;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

public class SauceDemoPageObject {

    @FindBy(xpath = ".//input[@id='user-name']")
    private SelenideElement userName;

    @FindBy(xpath = ".//input[@id='password']")
    private SelenideElement password;


    @FindBy(xpath = ".//input[@id='login-button']")
    private SelenideElement loginButton;

    public SelenideElement getPassword() {
        return password;
    }

    public SelenideElement getLoginButton() {
        return loginButton;
    }

    public SelenideElement getUserName() {
        return userName;
    }
}
