package JAVABASE;

import java.util.Scanner;

public class ManipulandoStrings {
    public static void main(String[] args) {
        System.out.println("Sistema rodando...");

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite seu nome completo: ");
        String nomeCompleto = scan.nextLine().trim();

        scan.close();

        if (nomeCompleto.isEmpty()) {
            System.out.println("Você não digitou nada!");
            return;
        }

        String[] partes = nomeCompleto.split("\\s+");
        String nomeCorrigido = String.join(" ", partes); // junta de novo sem espaços a mais

        char pLetra = nomeCorrigido.charAt(0);
        char uLetra = nomeCorrigido.charAt(nomeCorrigido.length() - 1);

        System.out.println("Primeiro nome: " + partes[0]);

        if (partes.length > 1) {
            System.out.println("Sobrenome: " + partes[partes.length - 1]);
        } else {
            System.out.println("Nenhum sobrenome encontrado.");
        }

        System.out.println("Nome completo: " + nomeCorrigido);
        System.out.println("Primeira letra: " + pLetra);
        System.out.println("Última letra: " + uLetra);
    }
}
