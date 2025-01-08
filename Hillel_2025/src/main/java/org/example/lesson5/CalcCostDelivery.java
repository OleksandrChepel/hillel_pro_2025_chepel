package org.example.lesson5;

public class CalcCostDelivery {
    // Вартість доставки
    private final static double deliveryPrice = 7.0 ;

    // Розрахунок вартості товару,
    // з урахуванням вартості доставки

    public double calcCost(Product product) {
        return product.getQuota() *  product.getPrice() + deliveryPrice;
    }
}

