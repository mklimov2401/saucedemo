package ru.klimov;

import org.junit.jupiter.api.Test;
import ru.klimov.pageObjects.ProductsPageObject;
import ru.klimov.pageObjects.LoginPageObject;

import static com.codeborne.selenide.CollectionCondition.*;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class StandardUserTest extends BaseTest {


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

    @Test
    void addToCartTest() {
        ProductsPageObject products = page(ProductsPageObject.class);

        loginInStandardUserTest();

        products.backpack.click();
        products.onesie.click();
        products.shoppingCartLink.click();

        products.inventoryItemName.shouldBe(size(2));
        products.getCart(0).shouldBe(text("Sauce Labs Backpack"));
        products.getCartPrice(0).shouldBe(text("$29.99"));
        products.getCart(1).shouldBe(text("Sauce Labs Onesie"));
        products.getCartPrice(1).shouldBe(text("$7.99"));

    }

    @Test
    void removeToCartTest() {
        ProductsPageObject products = page(ProductsPageObject.class);

        addToCartTest();

        products.removeOnesie.click();
        products.inventoryItemName.shouldBe(size(1));
        products.getItemNotCart("Sauce Labs Onesie");
    }
}
