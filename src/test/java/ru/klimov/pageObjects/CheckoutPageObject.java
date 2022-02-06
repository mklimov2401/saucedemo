package ru.klimov.pageObjects;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class CheckoutPageObject {

    public final SelenideElement checkout = $("#checkout");
    public final SelenideElement firstName = $("#first-name");
    public final SelenideElement lastName = $("#last-name");
    public final SelenideElement postalCode = $("#postal-code");
    public final SelenideElement continueBtn = $("#continue");
    public final SelenideElement finish = $("#finish");
    public final SelenideElement title = $(".title");
    public final SelenideElement summaryValueLabel = $(".summary_value_label");
    public final SelenideElement summaryTotalLabel = $(".summary_total_label");
    public final SelenideElement completeHeader = $(".complete-header");
    public final SelenideElement completeText = $(".complete-text");
}
