package ru.klimov;

import org.junit.jupiter.api.Test;
import ru.klimov.pageObjects.LoginPageObject;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class TitleSauceDemoTest extends BaseTest {


    @Test
    void openTitlePageSauceDemo() {
        LoginPageObject login = page(LoginPageObject.class);

        open(config.hostname());
        login.userName.shouldBe(enabled);
        login.password.shouldBe(enabled);
        login.loginButton.shouldBe(enabled);

    }
}
