import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println(" Digite seu saldo: ");
        double saldo = s.nextDouble();

        double saldo2 = saldo + (saldo * 1/100);
        System.out.println("seu saldo reajustado é: " + saldo2 );

    }
}
