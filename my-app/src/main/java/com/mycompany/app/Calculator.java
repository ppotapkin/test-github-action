package com.mycompany.app;

import java.util.Optional;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public Optional<Integer> divide(int a, int b) {
        if (b == 0) {
            return Optional.empty();
        }
        else {
            return Optional.of(a / b);
        }
    }
}
