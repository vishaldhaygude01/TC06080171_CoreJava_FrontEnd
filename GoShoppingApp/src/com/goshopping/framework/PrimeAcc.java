package com.goshopping.framework;

public abstract class PrimeAcc extends ShopAcc {
    private final boolean isPrime;
    private static final float deliveryCharges = 0.0f;

    public PrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
        super(accNo, accNm, charges);
        this.isPrime = isPrime;
    }

    public boolean isPrime() {
        return isPrime;
    }

    public static float getDeliveryCharges() {
        return deliveryCharges;
    }

    @Override
    public abstract void bookProduct(float amount);

    @Override
    public String toString() {
        return super.toString() + ", Prime: " + isPrime;
    }
}

