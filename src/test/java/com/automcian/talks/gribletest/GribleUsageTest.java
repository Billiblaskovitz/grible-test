package com.automcian.talks.gribletest;

import com.automcian.talks.gribletest.testconfigs.BaseTest;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;

public class GribleUsageTest extends BaseTest {

    @Test
    public void createTestTableBasedOnDataStorageForNewProduct()  {
        open("/");

    }
}
