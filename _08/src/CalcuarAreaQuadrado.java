import java.util.Scanner;

public class CalcuarAreaQuadrado
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Quadrado quadradoX, quadradoY; // define as variáveis que serão utilizadas para referenciar os objetos

        // criação dos objetos:
        quadradoX = new Quadrado();
        quadradoY = new Quadrado();

        System.out.print("Digite a altura do primeiro quadrado: ");
        quadradoX.altura = sc.nextDouble();
        System.out.print("Digite a largura do primeiro quadrado: ");
        quadradoX.largura = sc.nextDouble();

        System.out.print("Digite a altura do segundo quadrado: ");
        quadradoY.altura = sc.nextDouble();
        System.out.print("Digite a largura do segundo quadrado: ");
        quadradoY.largura = sc.nextDouble();

        double areaX = quadradoX.area();
        double areaY = quadradoY.area();

        System.out.print("Area do primeiro quadrado: "+areaX);
        System.out.println(", Area do segundo quadrado: "+areaY);
    }
}
