package ru.klimov;

import org.junit.jupiter.api.Test;
import pageObjects.ProductsPageObject;
import pageObjects.SauceDemoPageObject;

import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class LoginInStandardUserTest extends BaseTest {


    @Test
    void loginInStandardUserTest() {
        SauceDemoPageObject s = page(SauceDemoPageObject.class);
        ProductsPageObject p = page(ProductsPageObject.class);

        open(config.hostname());
        $(s.getUserName()).setValue(config.standardUser());
        $(s.getPassword()).setValue(config.password());
        $(s.getLoginButton()).click();
        $(p.getTitle()).shouldHave(text("PRODUCTS"));

    }
}
