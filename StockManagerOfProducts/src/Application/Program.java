package Application;

import Entities.Product;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner read = new Scanner(System.in);

        System.out.print("Name: ");
        String name = read.nextLine();
        System.out.print("\nPrice: ");
        double price = read.nextDouble();
        System.out.print("\nQuantity: ");
        int quantity = read.nextInt();

        Product product = new Product(name, price, quantity);
        manageStock(product, read);

        read.close();
    }
    // Método principal para interagir com o usuário
    private static void manageStock(Product product, Scanner read) {
        int option;
        do {
            System.out.println("\nChoose one of the options below:" +
                    "\n1 - Add products to stock." +
                    "\n2 - Remove products from stock." +
                    "\n3 - Exit.");
            option = read.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Enter the quantity of products to add: ");
                    int quantityToAdd = read.nextInt();
                    product.addProducts(quantityToAdd);
                    break;
                case 2:
                    System.out.print("Enter the quantity of products to remove: ");
                    int quantityToRemove = read.nextInt();
                    if (quantityToRemove > product.getQuantity()) {
                        System.out.println("Insufficient stock!");
                    } else {
                        product.removeProducts(quantityToRemove);
                    }
                    break;
                case 3:
                    System.out.println("Bye!");
                    break;
                default:
                    System.out.println("Invalid option!");
            }
            System.out.println(product);
        } while (option != 3);
    }
}

