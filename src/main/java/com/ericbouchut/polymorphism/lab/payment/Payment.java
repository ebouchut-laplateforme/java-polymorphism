package com.ericbouchut.polymorphism.lab.payment;

import java.math.BigDecimal;

/**
 * Define a payment contract, that is the methods a class
 * implementing this interface should define.
 */
public interface Payment {
    boolean pay(BigDecimal amount);
    String generateReceipt();
}
