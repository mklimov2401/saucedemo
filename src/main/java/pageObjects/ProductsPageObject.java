package pageObjects;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

public class ProductsPageObject {

    @FindBy(xpath = ".//span[@class='title']")
    private SelenideElement title;

    public SelenideElement getTitle() {
        return title;
    }
}
