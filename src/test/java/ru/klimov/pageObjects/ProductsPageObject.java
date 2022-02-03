package ru.klimov.pageObjects;

import com.codeborne.selenide.*;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class ProductsPageObject {

    public final SelenideElement title = $(By.xpath(".//span[@class='title']"));
    public final SelenideElement backpack = $(By.xpath(".//button[@id='add-to-cart-sauce-labs-backpack']"));
    public final SelenideElement onesie = $(By.xpath(".//button[@id='add-to-cart-sauce-labs-onesie']"));
    public final SelenideElement shoppingCartLink = $(By.xpath(".//a[@class='shopping_cart_link']"));
    public final ElementsCollection inventoryItemName = $$(".inventory_item_name");
    public final ElementsCollection inventoryItemPrice = $$(".inventory_item_price");

    public SelenideElement getCart(int index) {
        return inventoryItemName.get(index);
    }
    public SelenideElement getCartPrice(int index) {
        return inventoryItemPrice.get(index);
    }
}
