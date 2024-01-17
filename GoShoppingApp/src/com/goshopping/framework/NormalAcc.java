package com.goshopping.framework;

public abstract class NormalAcc extends ShopAcc {
    private final float deliveryCharges;

    public NormalAcc(int accNo, String accNm, float charges, float deliveryCharges) {
        super(accNo, accNm, charges);
        this.deliveryCharges = deliveryCharges;
    }

    public float getDeliveryCharges() {
        return deliveryCharges;
    }

    @Override
    public abstract void bookProduct(float amount);

    @Override
    public String toString() {
        return super.toString() + ", Delivery Charges: " + deliveryCharges;
    }
}