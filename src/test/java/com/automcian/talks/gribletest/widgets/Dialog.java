package com.automcian.talks.gribletest.widgets;

import static com.codeborne.selenide.Selenide.$;

public class Dialog {
    public void setFor(String label, String value) {
        $(".product-name").setValue(value);
    }
}
