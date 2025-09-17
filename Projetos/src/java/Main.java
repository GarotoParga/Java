package java;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Sistema principal rodando...");
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> numLista = new ArrayList<>();
        ArrayList<Integer> numsPares = new ArrayList<>();
        ArrayList<Integer> numsImpares = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite um número: ");
            int num = sc.nextInt();
            numLista.add(num);

            if (num % 2 == 0) {
                numsPares.add(num);
            } else {
                numsImpares.add(num);
            }
        }

        sc.close();

        System.out.println("\n---- Resultado ----");
        System.out.println("Todos os números: " + numLista);
        System.out.println("Pares: " + numsPares);
        System.out.println("Ímpares: " + numsImpares);

        System.out.println("Sistema principal finalizado.");
    }
}
