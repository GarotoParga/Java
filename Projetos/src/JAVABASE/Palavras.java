package JAVABASE;

import java.util.Scanner;

public class Palavras {
    public static void main(String[] args) {
        System.out.println("Sistema rodando...");
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite uma frase: ");
        String frase = scan.nextLine().trim();
        String[] palavras = frase.split("\\s+");
        String fraseSemSpaco = frase.replace(" ", "");

        if (frase.isEmpty()) {
            System.out.println("Está vazio! Por favor digite algo.");
            return;
        } else {
            System.out.println("----DADOS ANALISADOS----");
            System.out.println("O total de palavras é " + palavras.length);
            System.out.println("O total de letras é " + fraseSemSpaco.length());

            for (String palavra : palavras) {
                System.out.println(palavra + " " +  palavra.length() + " letras.");
            }
            if(palavras.length > 1){
                String maior;
                String menor;
                for(int i = 0; i < palavras.length; i++){
                    if(palavras[i].length() > palavras[i+1].length()){

                    }
                }

            }
        }
    }
}


