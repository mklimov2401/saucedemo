package ru.klimov.performance;

import org.junit.jupiter.api.Test;
import pageObjects.ProductsPageObject;
import ru.klimov.BaseTest;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.page;

public class AddToCart extends BaseTest {

    @Test
    void addToCartTest() {
        ProductsPageObject products = page(ProductsPageObject.class);
        LoginPerformance login = new LoginPerformance();
        login.loginInPerformanceUserTest();

        products.backpack.click();
        products.onesie.click();
        products.shoppingCartLink.click();

        products.inventoryItemName.shouldBe(size(2));
        products.getCart(0).shouldBe(text("Sauce Labs Backpack"));
        products.getCartPrice(0).shouldBe(text("$29.99"));
        products.getCart(1).shouldBe(text("Sauce Labs Onesie"));
        products.getCartPrice(1).shouldBe(text("$7.99"));

    }
}
