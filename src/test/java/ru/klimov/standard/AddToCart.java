package ru.klimov.standard;

import org.junit.jupiter.api.Test;
import ru.klimov.BaseTest;
import ru.klimov.pageObjects.ProductsPageObject;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.page;

public class AddToCart extends BaseTest {

    @Test
    void addToCartTest() {
        ProductsPageObject products = page(ProductsPageObject.class);
        Login login = new Login();
        login.loginInStandardUserTest();

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
