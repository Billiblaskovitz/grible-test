package com.automcian.talks.gribletest;

import com.automcian.talks.gribletest.testconfigs.BaseTest;
import org.junit.Test;

public class GribleUsageTest extends BaseTest {

    @Test
    public void createTestTableBasedOnDataStorageForNewProduct() {
        Products products = new Products();

        products.open();
    }
}
