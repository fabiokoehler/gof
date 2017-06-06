package com.koehler;

import com.koehler.cart.ShoppingCart;
import com.koehler.inventory.Item;
import com.koehler.payment.CreditCard;
import com.koehler.payment.Paypal;

public class ShoppingCartTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ShoppingCart cart = new ShoppingCart();

        Item item1 = new Item("1234", 10);
        Item item2 = new Item("5678", 40);

        cart.addItem(item1);
        cart.addItem(item2);

        //pay by paypal
        cart.pay(new Paypal("myemail@example.com", "mypwd"));

        //pay by credit card
        cart.pay(new CreditCard("Fabio Koehler", "1234567890123456", "786", "12/15"));
    }
}
