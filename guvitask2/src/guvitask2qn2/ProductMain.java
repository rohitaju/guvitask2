package guvitask2qn2;

import java.util.Scanner;

public class ProductMain {

    // Method to calculate total amount spent on all products
    public static double calculateTotalAmount(Product[] products) {
        double total = 0;
        for (Product p : products) {
            total += p.price * p.quantity;
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Product[] products = new Product[5];

        // Accept product data from user
        for (int i = 0; i < products.length; i++) {
            System.out.println("\nEnter details for product " + (i + 1));
            System.out.print("Enter Product ID: ");
            int pid = sc.nextInt();

            System.out.print("Enter Price: ");
            double price = sc.nextDouble();

            System.out.print("Enter Quantity: ");
            int quantity = sc.nextInt();

            // Store product in array
            products[i] = new Product(pid, price, quantity);
        }

        // Find product with highest price
        double maxPrice = products[0].price;
        int maxPid = products[0].pid;

        for (int i = 1; i < products.length; i++) {
            if (products[i].price > maxPrice) {
                maxPrice = products[i].price;
                maxPid = products[i].pid;
            }
        }

        System.out.println("\nProduct ID with the highest price: " + maxPid);

        // Calculate total amount spent
        double totalSpent = calculateTotalAmount(products);
        System.out.println("Total amount spent on all products: ₹" + totalSpent);

        sc.close();
    }
}