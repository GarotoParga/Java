package POOI.PROGRAMA01;

public class Main {
    public static void main(String[] args) {
        ControleRemoto controle = new ControleRemoto();

        controle.ligar();

        for (int i = 0; i < 100; i+= 10 ){
            controle.menosVolume();
        }

        controle.abrirMenu();

    }
}
