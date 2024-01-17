package com.goshopping.application;

import com.goshopping.framework.NormalAcc;

public class GSNormalAcc extends NormalAcc {
    private float extraCharges;

    public GSNormalAcc(int accNo, String accNm, float charges, float deliveryCharges) {
        super(accNo, accNm, charges, deliveryCharges);
        this.extraCharges = deliveryCharges;
    }

    @Override
    public void bookProduct(float amount) {
        float totalAmount = amount + extraCharges;
        System.out.println("Booking product for Normal Account. Total amount: " + totalAmount);
        System.out.println("Normal account charges for delivery: " + extraCharges);
    }
    
    @Override
    public String toString() {
        return super.toString() + ", Extra Charges: " + extraCharges;
    }
}
