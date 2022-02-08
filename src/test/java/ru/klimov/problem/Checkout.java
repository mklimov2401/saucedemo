package ru.klimov.problem;

import org.junit.jupiter.api.Test;
import pageObjects.CheckoutPageObject;
import pageObjects.LoginPageObject;
import pageObjects.ProductsPageObject;
import ru.klimov.BaseTest;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;

public class Checkout extends BaseTest {

    @Test
    void checkOutProblem() {
        CheckoutPageObject check = page(CheckoutPageObject.class);
        LoginPageObject login = page(LoginPageObject.class);
        ProductsPageObject products = page(ProductsPageObject.class);

        open(config.hostname());

        login.userName.setValue(config.problemUser());
        login.password.setValue(config.password());
        login.loginButton.click();

        products.backpack.click();
        products.onesie.click();
        products.shoppingCartLink.click();

        check.checkout.click();
        check.title.shouldBe(text("CHECKOUT: YOUR INFORMATION"));
        check.continueBtn.click();
        login.error.shouldBe(text("Error: First Name is required"));
        check.firstName.setValue("Max");
        check.continueBtn.click();
        login.error.shouldBe(text("Error: Last Name is required"));
    }
}
