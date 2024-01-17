package com.goshopping.application;

import com.goshopping.framework.ShopFactory;
import com.goshopping.framework.PrimeAcc;
import com.goshopping.framework.NormalAcc;

import java.util.Scanner;

public class ApplicationEntryPoint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to GoShopping App!");

    
        System.out.println("Enter Prime Account details:");
        System.out.print("Account Number: ");
        int primeAccNo = scanner.nextInt();
        System.out.print("Account Name: ");
        String primeAccName = scanner.next();
        System.out.print("Account Charges: ");
        float primeAccCharges = scanner.nextFloat();


        PrimeAcc primeAcc = createPrimeAccount(primeAccNo, primeAccName, primeAccCharges);

      
        System.out.println("\nEnter Normal Account details:");
        System.out.print("Account Number: ");
        int normalAccNo = scanner.nextInt();
        System.out.print("Account Name: ");
        String normalAccName = scanner.next();
        System.out.print("Account Charges: ");
        float normalAccCharges = scanner.nextFloat();
        System.out.print("Delivery Charges: ");
        float normalDeliveryCharges = scanner.nextFloat();

    
        NormalAcc normalAcc = createNormalAccount(normalAccNo, normalAccName, normalAccCharges, normalDeliveryCharges);

   
        System.out.print("\nEnter the product amount for Prime Account booking: ");
        float primeProductAmount = scanner.nextFloat();
        primeAcc.bookProduct(primeProductAmount);

        System.out.print("Enter the product amount for Normal Account booking: ");
        float normalProductAmount = scanner.nextFloat();
        normalAcc.bookProduct(normalProductAmount);


        System.out.println("\nPrime Account Details:");
        System.out.println(primeAcc.toString());

        System.out.println("\nNormal Account Details:");
        System.out.println(normalAcc.toString());

       
    }

    private static PrimeAcc createPrimeAccount(int accNo, String accNm, float charges) {
        ShopFactory shopFactory = new GSShopFactory();
        return shopFactory.getNewPrimeAcc(accNo, accNm, charges, true);
    }

    private static NormalAcc createNormalAccount(int accNo, String accNm, float charges, float deliveryCharges) {
        ShopFactory shopFactory = new GSShopFactory();
        return shopFactory.getNewNormalAcc(accNo, accNm, charges, deliveryCharges);
    }
}
