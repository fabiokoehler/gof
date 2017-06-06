package com.koehler.cart;

import com.koehler.inventory.Item;
import com.koehler.payment.PaymentStrategy;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author fabio.koehler
 */
public class ShoppingCart {

    List<Item> items;

    public ShoppingCart() {
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        this.items.add(item);
    }

    public void removeItem(Item item) {
        this.items.remove(item);
    }

    public int calculateTotal() {
        int sum = 0;

//functional    
        //sum = items.stream().map((item) -> item.getPrice()).reduce(sum, Integer::sum);
        for (Item item : items) {
            sum += item.getPrice();
        }

        return sum;
    }

    public void pay(PaymentStrategy paymentMethod) {
        int amount = calculateTotal();
        paymentMethod.pay(amount);
    }
}
