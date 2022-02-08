package pageObjects;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

public class CheckoutPageObject {

    public final SelenideElement checkout = Selenide.$("#checkout");
    public final SelenideElement firstName = Selenide.$("#first-name");
    public final SelenideElement lastName = Selenide.$("#last-name");
    public final SelenideElement postalCode = Selenide.$("#postal-code");
    public final SelenideElement continueBtn = Selenide.$("#continue");
    public final SelenideElement finish = Selenide.$("#finish");
    public final SelenideElement title = Selenide.$(".title");
    public final SelenideElement summaryValueLabel = Selenide.$(".summary_value_label");
    public final SelenideElement summaryTotalLabel = Selenide.$(".summary_total_label");
    public final SelenideElement completeHeader = Selenide.$(".complete-header");
    public final SelenideElement completeText = Selenide.$(".complete-text");
}
