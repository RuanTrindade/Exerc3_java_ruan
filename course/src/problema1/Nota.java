package problema1;

import java.util.Scanner;

public class Nota {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Digite a primeira nota: ");
        double primeiraNota = sc.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double segundaNota = sc.nextDouble();


        double notaFinal = primeiraNota + segundaNota;

        System.out.printf("NOTA FINAL = %.1f%n", notaFinal);


        if (notaFinal < 60.0) {
            System.out.println("REPROVADO");
        } else {
            System.out.println("APROVADO");
        }

        sc.close();
    }
}
