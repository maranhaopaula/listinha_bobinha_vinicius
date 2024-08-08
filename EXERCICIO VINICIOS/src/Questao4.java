import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        System.out.println("Digite o ipi do produto:");
        double ipi = p.nextDouble();
        System.out.println("Digite o ipi da peça:");
        int cd = p.nextInt();
        System.out.println("Digite o valor unitario da peça:");
        int vu = p.nextInt();
        System.out.println("Digite a quantidade de peça:");
        int qu = p.nextInt();
        System.out.println("Digite o codigo do peça 2:");
        int cd2 = p.nextInt();
        System.out.println("Digite o  valor unitário da peça 2:");
        int vu2 = p.nextInt();
        System.out.println("Digite a quantidade de peça 2: ");
        int qu2 = p.nextInt();

        double somaTudo = (vu+qu+vu2*qu2)*(ipi/100+1);
        System.out.printf("O valor total a ser pago e %,.2f" ,somaTudo);


    }
}
