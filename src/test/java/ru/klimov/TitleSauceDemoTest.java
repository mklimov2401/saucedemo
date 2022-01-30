package ru.klimov;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;
import pageObjects.SauceDemoPageObject;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class TitleSauceDemoTest extends BaseTest {


    @Test
    void openTitlePageSauceDemo() {
        SauceDemoPageObject s = page(SauceDemoPageObject.class);

        open(config.hostname());
        $(s.getUserName()).shouldBe(enabled);
        $(s.getPassword()).shouldBe(enabled);
        $(s.getLoginButton()).shouldBe(enabled);

    }
}
