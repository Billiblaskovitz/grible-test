package com.automcian.talks.gribletest.widgets;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;

public class Dialog {
    private SelenideElement container = $(".ui-dialog");

    public void setFor(String label, String value) {
        container.$(withText(label)).find(byXpath("./following-sibling::*/input")).setValue(value);
        $(".product-name").setValue(value);
    }
}
