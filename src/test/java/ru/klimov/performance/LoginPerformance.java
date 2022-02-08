package ru.klimov.performance;

import org.junit.jupiter.api.Test;
import pageObjects.LoginPageObject;
import pageObjects.ProductsPageObject;
import ru.klimov.BaseTest;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;

public class LoginPerformance extends BaseTest {


    @Test
    void loginInPerformanceUserTest() {
        LoginPageObject login = page(LoginPageObject.class);
        ProductsPageObject products = page(ProductsPageObject.class);

        open(config.hostname());

        login.userName.setValue(config.performanceGlitchUser());
        login.password.setValue(config.password());
        login.loginButton.click();

        products.title.shouldHave(text("PRODUCTS"));

    }
}
