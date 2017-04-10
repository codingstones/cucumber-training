package com.codingstones.bdd;

public class VATCalculator {
    public float calculateTotal(String product, int price) {
        if (product.equals("diapers")) return (float) (price * 1.21);
        if (product.equals("bread")) return (float) (price * 1.04);
        if (product.equals("cinema tickets")) return (float) (price * 1.10);
        return price;
    }
}
