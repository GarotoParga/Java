package JAVABASE;

import java.util.Scanner;
public class HelloWorld {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um numero e saberemos se ele é impar ou par :");

        int n1 = scan.nextInt();
        System.out.println(n1);

            if (n1 % 2 == 0) {
            System.out.println("Seu numero é par");
        } else {
            System.out.println("Seu numero é impar");

        }


    }
}
