package problema3;

import java.util.Scanner;

public class Menor_de_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Primeiro valor: ");
        int primeiro = sc.nextInt();

        System.out.print("Segundo valor: ");
        int segundo = sc.nextInt();

        System.out.print("Terceiro valor: ");
        int terceiro = sc.nextInt();


        int menor = primeiro;

        if (segundo < menor) {
            menor = segundo;
        }

        if (terceiro < menor) {
            menor = terceiro;
        }


        System.out.println("MENOR = " + menor);

        sc.close();
    }
}
