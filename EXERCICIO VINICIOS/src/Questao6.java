import java.util.Scanner;

public class Questao6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero = s.nextInt();
        int antecessor = numero-1;
        int sucessor = numero+1;

        System.out.printf("O número é %d, o seu sucessor %d, o seu antecessor é %d",
                numero, numero+1, antecessor);

    }
}
