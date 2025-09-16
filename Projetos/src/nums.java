import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class nums {
    public static void main(String[] args) {
        System.out.println("Sistema rodando...");
        Scanner scan = new Scanner(System.in);

        ArrayList<Integer> numeros = new ArrayList<>();

        while (true) {
            System.out.println("Digite um número: ");
            int num = scan.nextInt();

            if (num == 0) {
                break; // não adiciona o 0
            }

            numeros.add(num);
        }

        if (!numeros.isEmpty()) {
            int maior = Collections.max(numeros);
            int menor = Collections.min(numeros);

            System.out.println("Ação concluída.");
            System.out.println("Os números ao total são " + numeros.size() + " sendo: " + numeros);
            System.out.println("O número maior é: " + maior);
            System.out.println("O número menor é: " + menor);
        } else {
            System.out.println("Nenhum número válido foi digitado.");
        }

        System.out.println("Programa encerrado!");
        scan.close();
    }
}
