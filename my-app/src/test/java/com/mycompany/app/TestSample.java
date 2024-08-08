package com.mycompany.app;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Optional;

@Test
public class TestSample {


    private final Logger logger = LoggerFactory.getLogger(TestSample.class);

    private final Calculator calculator = new Calculator();

    public void testAdding() {
        Assert.assertEquals(calculator.add(2, 2), 4);
        logger.info("Test passed");
    }

    public void testSubtracting() {
        Assert.assertEquals(calculator.subtract(5, 2), 3);
        logger.info("Test passed");
    }

    public void testMultiplication() {
        Assert.assertEquals(calculator.multiply(3, 3), 9);
        logger.info("Test passed");
    }

    public void testDividing() {
        Assert.assertEquals(calculator.divide(10, 5), Optional.of(2));
        logger.info("Test passed");
    }

    public void testDividingByZero() {
        Assert.assertEquals(calculator.divide(5, 0), Optional.empty());
        logger.info("Test passed");
    }

    public void testDividingZeroByZero() {
        Assert.assertEquals(calculator.divide(0, 0), Optional.empty());
        logger.info("Test passed");
    }
}