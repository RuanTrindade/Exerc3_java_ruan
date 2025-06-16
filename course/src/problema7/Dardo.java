package problema7;

import java.util.Scanner;

public class Dardo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Digite as tres distancias:");
        double dist1 = sc.nextDouble();
        double dist2 = sc.nextDouble();
        double dist3 = sc.nextDouble();


        double maior = dist1;

        if (dist2 > maior) {
            maior = dist2;
        }

        if (dist3 > maior) {
            maior = dist3;
        }


        System.out.printf("MAIOR DISTANCIA = %.2f%n", maior);

        sc.close();
    }
}
