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
        product.price = sc.nextDouble();
        System.out.print("Digite o quantidade do produto: ");
        product.quantity = sc.nextInt();

        System.out.print("Nome do produto: "+product.name);
        System.out.print(", Preço do produto: "+product.price);
        System.out.print(", Quantidade do produto: "+product.quantity);
        System.out.println(", Valor total do produto: "+product.TotalValueInStock());

        sc.close();
    }
}
