package Ass1;

import java.util.Scanner;
class Product {
    int pid;
    double price;
    int quantity;

    public Product(int pid, double price, int quantity) {
        this.pid = pid;
        this.price = price;
        this.quantity = quantity;
    }
}

public class XYZ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Product[] products = new Product[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details for product " + (i + 1));
            System.out.print("Enter Pid: ");
            int pid = scanner.nextInt();
            System.out.print("Enter Price: ");
            double price = scanner.nextDouble();
            System.out.print("Enter Quantity: ");
            int quantity = scanner.nextInt();

            products[i] = new Product(pid, price, quantity);
        }

      
        int maxPricePid = findMaxPricePid(products);
        System.out.println("Pid of product with the highest price: " + maxPricePid);
        double totalAmountSpent = calculateTotalAmountSpent(products);
        System.out.println("Total amount spent on all products " + totalAmountSpent);
    }

    private static int findMaxPricePid(Product[] products) {
        int maxPricePid = -1;
        double maxPrice = 	Double.MIN_VALUE;

        for (Product product : products) {
            if (product.price > maxPrice) {
                maxPrice = product.price;
                maxPricePid = product.pid;
            }
        }

        return maxPricePid;
    }

    private static int calculateTotalAmountSpent(Product[] products) {
        int totalAmountSpent = 0;

        for (Product product : products) {
            totalAmountSpent += product.price * product.quantity;
        }

        return totalAmountSpent;
    }
}