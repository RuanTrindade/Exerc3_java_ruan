package problema9;

import java.util.Scanner;

public class Lanchonete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Codigo do produto comprado: ");
        int codigo = sc.nextInt();

        System.out.print("Quantidade comprada: ");
        int quantidade = sc.nextInt();

        double preco;


        if (codigo == 1) {
            preco = 5.00;
        } else if (codigo == 2) {
            preco = 3.50;
        } else if (codigo == 3) {
            preco = 4.80;
        } else if (codigo == 4) {
            preco = 8.90;
        } else if (codigo == 5) {
            preco = 7.32;
        } else {
            preco = 0.0;
            System.out.println("Codigo de produto invalido!");
        }


        if (preco > 0.0) {
            double total = preco * quantidade;
            System.out.printf("Valor a pagar: R$ %.2f%n", total);
        }

        sc.close();
    }
}
