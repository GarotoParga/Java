package java;

import java.util.Scanner;

public class TAREFAS {
  public static void main(String[] args){
      Scanner S = new Scanner(System.in);

      System.out.println("Digite a sua nota do primeiro periodo..");
      float n1  = S.nextFloat();

      System.out.println("Digite a sua nota do segundo periodo");
      float n2 = S.nextFloat();

      System.out.println("Digite a sua nota do terceiro periodo");
      float n3 = S.nextFloat();

      System.out.println("Digite a sua nota do quarto periodo");
      float n4 = S.nextFloat();

      float ns = n1+n2+n3+n4 ;
      float nf = ns/4;
      System.out.println("A sua nota média é igual a "+ nf);
  }

}