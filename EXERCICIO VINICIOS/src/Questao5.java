import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println(" Digite seu salário: ");
        double salario = s.nextDouble();
        double div1 = 1412;
        double minimo= salario/div1;
        System.out.printf("você recebe: %.2f", +minimo,  "salarios minimos!");

    }
}
