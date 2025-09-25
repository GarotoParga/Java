package JAVABASE;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        System.out.println("Sistema rodando...");
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int n1 = scan.nextInt();
        System.out.println("Digite outro número: ");
        int n2 = scan.nextInt();

        System.out.println("Escolha uma operação.");
        System.out.println("Para somar, digite 1.");
        System.out.println("Para subtrair, digite 2.");
        System.out.println("Para multiplicar, digite 3.");
        System.out.println("Para dividir, digite 4.");
        System.out.println("Para sair, digite 0.");
        int escolha = scan.nextInt();
        if (escolha == 1) {
            System.out.println(somar(n1, n2));
        } else if (escolha == 2) {
            System.out.println(subtrair(n1, n2));
        } else if (escolha == 3) {
            System.out.println(multiplicar(n1, n2));
        } else if (escolha == 4) {
            System.out.println(dividir(n1, n2));
        } else {
            System.out.println("Sistema finalizado.");
        }

        scan.close();
    }

    public static int somar(int a, int b) {
        return a + b;
    }

    public static int subtrair(int a, int b) {
        return a - b;
    }

    public static int multiplicar(int a, int b) {
        return a * b;
    }

    public static float dividir(float a, float b) {
        return a / b;
    }
}


