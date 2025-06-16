package problema5;

import java.util.Scanner;

public class Troco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Preço unitário do produto: ");
        double precoUnitario = sc.nextDouble();

        System.out.print("Quantidade comprada: ");
        int quantidade = sc.nextInt();

        System.out.print("Dinheiro recebido: ");
        double dinheiroRecebido = sc.nextDouble();


        double total = precoUnitario * quantidade;

        if (dinheiroRecebido >= total) {
            double troco = dinheiroRecebido - total;
            System.out.printf("TROCO = %.2f%n", troco);
        } else {
            double falta = total - dinheiroRecebido;
            System.out.printf("DINHEIRO INSUFICIENTE. FALTAM %.2f REAIS%n", falta);
        }

        sc.close();
    }
}
