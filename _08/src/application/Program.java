package application;

import java.util.Scanner;
import entities.Product;

public class Program
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Product product = new Product();

        System.out.print("Digite o nome do produto: ");
        product.name = sc.nextLine();
        System.out.print("Digite o preço do produto: ");
        product.price = Double.parseDouble(sc.nextLine());
        System.out.print("Digite o quantidade do produto: ");
        product.quantity = Integer.parseInt(sc.nextLine());

        System.out.println("Product data: "+product);

        System.out.print("Enter the number of products to be added in stock: ");
        int quantity = Integer.parseInt(sc.nextLine());
        product.addProductsQuantity(quantity);
        System.out.println("Updated product data: "+product);

        System.out.print("Enter the number of products to be removed in stock: ");
        quantity = Integer.parseInt(sc.nextLine());
        product.removeProductsQuantity(quantity);
        System.out.println("Updated product data: "+product);

        sc.close();
    }
}
