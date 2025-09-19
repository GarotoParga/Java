package POO;

public class SerVivo {
    String nome, especie, cor;
    int idade, fome, energia;

    public void dormir() {
        if (this.energia <= 50) {
            System.out.println("O ser chamado " + this.nome + " da espécie " + this.especie + " está dormindo...");
            this.energia = this.energia + 30;
            this.fome = this.fome + 25;
        } else {
            System.out.println("O ser chamado " + this.nome + " da espécie " + this.especie + " não vai dormir, pois não está cansado.");
        }
    }
    public void comer() {
        if (this.fome < 10) {
            System.out.println("O ser chamado " + this.nome + " da espécie " + this.especie + " está sem fome.");
        } else {
            System.out.println("O ser chamado " + this.nome + " da espécie " + this.especie + " está comendo...");
            this.energia = this.energia + 5;
            this.fome = this.fome - 25;
        }
    }
    public void statusSerVivo(){
        System.out.println("Nome do ser: " + this.nome);
        System.out.println("Espécie do ser: " + this.especie);
        System.out.println("Idade do ser: " + this.idade);
        System.out.println("Cor do ser: " + this.cor);
        System.out.println("-----Energia e Fome-----");
        System.out.println("Energia: " + this.energia + "%");
        System.out.println("Fome: " + this.fome + "%");

    }
}
