package POO.PROGRAMA02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número para descobrir se ele é Par ou Ímpar: ");
        int num = scan.nextInt();
        Numero oip = new Numero(num);
    }
}
