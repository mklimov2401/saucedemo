package ru.klimov.standard;

import org.junit.jupiter.api.Test;
import pageObjects.CheckoutPageObject;
import pageObjects.ProductsPageObject;
import ru.klimov.BaseTest;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.page;

public class Checkout extends BaseTest {

    @Test
    void checkOut() {
        CheckoutPageObject check = page(CheckoutPageObject.class);
        ProductsPageObject products = page(ProductsPageObject.class);
        AddToCart add = new AddToCart();
        add.addToCartTest();

        check.checkout.click();
        check.title.shouldBe(text("CHECKOUT: YOUR INFORMATION"));
        check.firstName.setValue("Max");
        check.lastName.setValue("Ivanov");
        check.postalCode.setValue("Moscow");
        check.continueBtn.click();

        check.title.shouldBe(text("CHECKOUT: OVERVIEW"));
        products.inventoryItemName.shouldBe(size(2));
        products.getCart(0).shouldBe(text("Sauce Labs Backpack"));
        products.getCartPrice(0).shouldBe(text("$29.99"));
        products.getCart(1).shouldBe(text("Sauce Labs Onesie"));
        products.getCartPrice(1).shouldBe(text("$7.99"));
        check.summaryValueLabel.shouldBe(text("SauceCard #31337"));
        check.summaryTotalLabel.shouldBe(text("Total: $41.02"));
        check.finish.click();

        check.title.shouldBe(text("CHECKOUT: COMPLETE!"));
        check.completeHeader.shouldBe(text("THANK YOU FOR YOUR ORDER"));
        check.completeText.shouldBe(text("Your order has been dispatched, and will arrive just as fast as the pony can get there!"));


    }
}
