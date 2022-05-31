package ru.klimov;

import org.junit.jupiter.api.Test;
import pageObjects.LoginPageObject;

import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;

public class TitleSauceDemoTest extends BaseTest {

    /*
    1
     */
    @Test
    void openTitlePageSauceDemo() {
        LoginPageObject login = page(LoginPageObject.class);

        open(config.hostname());

        login.userName.shouldBe(enabled);
        login.password.shouldBe(enabled);
        login.loginButton.shouldBe(enabled);

    }
}
