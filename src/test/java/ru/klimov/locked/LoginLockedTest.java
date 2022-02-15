package ru.klimov.locked;

import org.junit.jupiter.api.Test;
import pageObjects.LoginPageObject;
import ru.klimov.BaseTest;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;

public class LoginLockedTest extends BaseTest {


    @Test
    void loginInLockedUserTest() {
        LoginPageObject login = page(LoginPageObject.class);

        open(config.hostname());

        login.userName.setValue(config.lockedOutUser());
        login.password.setValue(config.password());
        login.loginButton.click();
        login.error.shouldBe(text("Epic sadface: Sorry, this user has been locked out."));
    }
}
