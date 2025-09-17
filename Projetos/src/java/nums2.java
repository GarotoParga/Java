package java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class nums2 {
    public static void main(String[] args) {
        System.out.println("Sistema rodando...");
        Scanner scan = new Scanner(System.in);

        ArrayList<Integer> nums = new ArrayList<>();

        double totalSoma = 0;

        while (true) {
            System.out.println("Digite um número: ");
            int num = scan.nextInt();
            if (num == 0) {
                System.out.println("Programa finalizado.");
                break;
            }
            nums.add(num);
            totalSoma = totalSoma + num;
        }

        if (!nums.isEmpty()) {
            double media = totalSoma / nums.size();

            System.out.println("Todos os números: " + nums);
            System.out.println("Quantidade no total é: " + nums.size());
            System.out.println("Soma dos números: " + totalSoma);
            System.out.println("Maior: " + Collections.max(nums));
            System.out.println("Menor: " + Collections.min(nums));
            System.out.println("A média é: " + media);
        } else {
            System.out.println("Nenhum número válido foi digitado.");
        }

    }


}
