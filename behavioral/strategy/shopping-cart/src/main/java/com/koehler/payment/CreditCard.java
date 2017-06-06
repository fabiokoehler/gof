package com.koehler.payment;

/**
 *
 * @author fabio.koehler
 */
public class CreditCard implements PaymentStrategy {

    private final String name;
    private final String cardNumber;
    private final String cvv;
    private final String dateOfExpiry;

    public CreditCard(String nm, String ccNum, String cvv, String expiryDate) {
        this.name = nm;
        this.cardNumber = ccNum;
        this.cvv = cvv;
        this.dateOfExpiry = expiryDate;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid with credit/debit card");
    }
}
