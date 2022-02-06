package ru.klimov.standard;

import org.junit.jupiter.api.Test;
import ru.klimov.BaseTest;
import ru.klimov.pageObjects.LoginPageObject;
import ru.klimov.pageObjects.ProductsPageObject;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;

public class Login extends BaseTest {


    @Test
    void loginInStandardUserTest() {
        LoginPageObject login = page(LoginPageObject.class);
        ProductsPageObject products = page(ProductsPageObject.class);

        open(config.hostname());

        login.userName.setValue(config.standardUser());
        login.password.setValue(config.password());
        login.loginButton.click();

        products.title.shouldHave(text("PRODUCTS"));

    }
}
