package ru.klimov.standard;

import org.junit.jupiter.api.Test;
import ru.klimov.BaseTest;
import ru.klimov.pageObjects.ProductsPageObject;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Selenide.page;

public class RemoveToCart extends BaseTest {

    @Test
    void removeToCartTest() {
        ProductsPageObject products = page(ProductsPageObject.class);
        AddToCart add = new AddToCart();
        add.addToCartTest();

        products.removeOnesie.click();
        products.inventoryItemName.shouldBe(size(1));
        products.getItemNotCart("Sauce Labs Onesie");
    }
}