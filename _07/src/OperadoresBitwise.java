import java.util.Scanner;

public class OperadoresBitwise
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero: ");

        int mask = 0b00100000; // 0b para definir que é um binário
        int num = sc.nextInt();

        if ((num & mask) != 0) { // se num = mask, quer dizer que o sexto bit de num é TRUE igual à variável mask
            System.out.println("O sexto bit do número digitado é TRUE!");
        }
        else {
            System.out.println("O sexto bit do número digitado é FALSE!");
        }

        sc.close();
    }
}
