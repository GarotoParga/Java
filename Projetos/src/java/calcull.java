package java;

import java.util.ArrayList;
import java.util.Scanner;

public class calcull {
    public static void main(String[] args) {
        System.out.println("Sistema rodando...");
        Scanner scan = new Scanner(System.in);
        ArrayList<Double> numbers = new ArrayList<>();
        double soma = 0;
        System.out.println("Coloque 4 notas para saber a média.");
        int davi = 1;
        for (int i = 0; i < 4; i++) {
            System.out.println("Digite a nota " + davi + ":");
            double num = scan.nextDouble();
            numbers.add(num);
            soma = soma + numbers.get(i);
            davi ++;
        }
        scan.close();
        double media = soma / numbers.size();

        System.out.println("A media é: " + media);
    }
}
