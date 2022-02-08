package pageObjects;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

public class ProductsPageObject {

    public final SelenideElement title = Selenide.$(By.xpath(".//span[@class='title']"));
    public final SelenideElement backpack = Selenide.$(By.xpath(".//button[@id='add-to-cart-sauce-labs-backpack']"));
    public final SelenideElement onesie = Selenide.$(By.xpath(".//button[@id='add-to-cart-sauce-labs-onesie']"));
    public final SelenideElement shoppingCartLink = Selenide.$(By.xpath(".//a[@class='shopping_cart_link']"));
    public final SelenideElement removeOnesie = Selenide.$("#remove-sauce-labs-onesie");
    public final ElementsCollection inventoryItemName = Selenide.$$(".inventory_item_name");
    public final ElementsCollection inventoryItemPrice = Selenide.$$(".inventory_item_price");

    public SelenideElement getCart(int index) {
        return inventoryItemName.get(index);
    }

    public void getItemNotCart(String name) {
        for (SelenideElement e :
                inventoryItemName) {
            e.shouldNotBe(Condition.text(name));
        }
    }
    public SelenideElement getCartPrice(int index) {
        return inventoryItemPrice.get(index);
    }
}
