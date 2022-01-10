package view;

import controller.ProductInterface;

import java.util.ArrayList;
import java.util.Scanner;

public class View {
    private final ProductInterface productController;

    public View(ProductInterface productController) {
        this.productController = productController;

        productController.add("Product A", 100, "SKU1", 20);
        productController.add("Product B", 110, "SKU2", 20);

    }

    public void run() {
        Scanner scanner = new Scanner(System.in);

        loop:
        while (true) {
            System.out.println("""
                     
                     0. Exit Program \r
                     1. Add actor \r
                     2. Remove actor \r
                     3. Find actor \r
                     4. Update actor \r
                    """);

            System.out.println("Enter input: ");
            int variant = scanner.nextInt();
            System.out.println("You've entered: " + variant);
            switch (variant) {
                case 0:
                    break loop;
                case 1:
                    addActor();
                    break;
            }
        }
    }

    private void addActor() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter product name:");
        try {
            String id = scanner.nextLine();
            System.out.println("Enter product price:");
            int price = scanner.nextInt();
        } catch (Exception e) {
            throw e;
        }
    }
}
