package com.goshopping.application;

import com.goshopping.framework.PrimeAcc;

public class GSPrimeAcc extends PrimeAcc {
    private static final float extraCharges = 0.0f;

    public GSPrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
        super(accNo, accNm, charges, isPrime);
    }

    @Override
    public void bookProduct(float amount) {
        float totalAmount = amount + extraCharges;
        System.out.println("Booking product for Prime Account. Total amount: " + totalAmount);
        System.out.println("Prime account benefits: Free delivery and extra discounts!");
    }

    @Override
    public String toString() {
        return super.toString() + ", Extra Charges: " + extraCharges;
    }
}

