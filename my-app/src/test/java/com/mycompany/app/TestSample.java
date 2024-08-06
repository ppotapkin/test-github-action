package com.mycompany.app;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Optional;

@Test
public class TestSample {

    Logger logger = LoggerFactory.getLogger(TestSample.class);

    private final Calculator calculator = new Calculator();

    public void testAdding() {
        Assert.assertEquals(4, calculator.add(2, 2));
        logger.info("Test passed");
    }

    public void testSubtracting() {
        Assert.assertEquals(3, calculator.subtract(5, 2));
        logger.info("Test passed");
    }

    public void testMultiplication() {
        Assert.assertEquals(9, calculator.multiply(3, 3));
        logger.info("Test passed");
    }

    public void testDividing() {
        Assert.assertEquals(Optional.of(2), calculator.divide(10, 5));
        logger.info("Test passed");
    }

    public void testDividingByZero() {
        Assert.assertEquals(Optional.empty(), calculator.divide(5, 0));
        logger.info("Test passed");
    }
}