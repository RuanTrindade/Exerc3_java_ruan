package problema11;

import java.util.Scanner;

public class Salario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o salario da pessoa: ");
        double salario = sc.nextDouble();

        double percentual = 0.0;


        if (salario <= 1000.00) {
            percentual = 20.0;
        } else if (salario <= 3000.00) {
            percentual = 15.0;
        } else if (salario <= 8000.00) {
            percentual = 10.0;
        } else {
            percentual = 5.0;
        }

        double aumento = salario * (percentual / 100.0);
        double novoSalario = salario + aumento;


        System.out.printf("Novo salario R$ %.2f%n", novoSalario);
        System.out.printf("Aumento R$ %.2f%n", aumento);
        System.out.printf("Porcentagem = %.0f%%%n", percentual);

        sc.close();
    }
}
