package JAVABASE;

import java.util.Scanner;

public class nomeCompleto {
    public static void main(String[] args) {
        System.out.println("Sistema rodando...");
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite seu nome completo: ");
        String nomeCompleto = scan.nextLine().trim();
        scan.close();

        String[] partes = nomeCompleto.split("\\s+");
        String nomeCorrigido = String.join(" ", partes);
        String nomeLimpo = nomeCompleto.replace(" ", "");
        if (nomeCompleto.isEmpty()) {
            System.out.println("Por favor digite seu nome! Está vazio.");
            return;
        }
        char pLetra = nomeLimpo.charAt(0);
        char uLetra = nomeLimpo.charAt(nomeLimpo.length() - 1);

        System.out.println("Seu nome completo é " + nomeCorrigido);

        if (partes.length > 1) {
            System.out.println("Seu primeiro nome é " + partes[0]);
            System.out.println("Seu sobrenome é " + partes[partes.length - 1]);
        } else {
            System.out.println("Sobrenome não encontrado!");
        }
        System.out.println("A primeira letra do seu nome é " + pLetra);
        System.out.println("A última letra do seu nome é " + uLetra);
        System.out.println("O total de caracteres são " + nomeLimpo.length());
    }
}
