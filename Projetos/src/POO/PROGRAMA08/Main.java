package POO.PROGRAMA08;

public class Main {
    public static void main(String[] args) {
        Pessoa[] leitores = new Pessoa[3];

        leitores[0] = new Pessoa("Davi", 20, "Masculino");
        leitores[1] = new Pessoa("Luísa", 18, "Feminina");
        leitores[2] = new Pessoa("Carla", 19, "Feminina");

        Livro manga = new Livro("Chapeuzinho vermelho", "Carlinhos do porco", leitores[1]);

        manga.abrir();
        manga.folhear(99); // Número escolhido para página atual
        manga.detalhes();
    }
}
