package problema12;

import java.util.Scanner;

public class Jogo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Hora inicial: ");
        int horaInicial = sc.nextInt();

        System.out.print("Hora final: ");
        int horaFinal = sc.nextInt();

        int duracao;

        if (horaFinal > horaInicial) {
            duracao = horaFinal - horaInicial;
        } else if (horaFinal == horaInicial) {
            duracao = 24;
        } else {
            duracao = 24 - (horaInicial - horaFinal);
        }

        System.out.printf("O JOGO DUROU %d HORA(S)%n", duracao);

        sc.close();
    }
}
