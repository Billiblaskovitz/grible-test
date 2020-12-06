package com.automcian.talks.gribletest;

import com.automcian.talks.gribletest.testconfigs.BaseTest;
import com.automcian.talks.gribletest.widgets.Products;
import org.junit.Test;

public class GribleUsageTest extends BaseTest {

    @Test
    public void createTestTableBasedOnDataStorageForNewProduct() throws InterruptedException {
        Products products = new Products();

        products.open();
        products.add("Product");


        Thread.sleep(5000);
    }
}
