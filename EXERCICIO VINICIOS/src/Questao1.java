import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Digite a sua idade em anos: ");
        int anos = s.nextInt();
        System.out.print("Digite a sua idade em meses: ");
        int meses = s.nextInt();
        System.out.print("Digite a sua idade em dias: ");
        int dias = s.nextInt();
        int idadeEmDias = anos  * 365 + meses * 30 + dias;
        System.out.println("A idade em dias é:" + idadeEmDias + "dias.");
    }
}
