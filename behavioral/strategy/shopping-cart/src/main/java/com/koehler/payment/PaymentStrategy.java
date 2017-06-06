package com.koehler.payment;

/**
 *
 * @author fabio.koehler
 */
public interface PaymentStrategy {

    public void pay(int amount);
}
