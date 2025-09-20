package POO.PROGRAMA01;

public class Cafe {
    int quantidade;
    boolean temCafe, muitoQuente, temLeite;

    public void encherXicaraDecafe() {
        if (this.temCafe) {
            System.out.println("Já tem café na xícara.");
        } else {
            System.out.println("Café colocado em sua xícara.");
            this.temCafe = true;
        }
    }

    public void colocarLeiteNoCafe() {
        if (this.temLeite) {
            System.out.println("Já tem leite em seu café.");
        } else {
            System.out.println("Leite colocado em seu café.");
            this.temLeite = true;
        }
    }

    public void tomarCafe() {
        if (this.quantidade == 0) {
            System.out.println("Não tem café! Sua xícara está vazia.");
            this.temCafe = false;
        } else if (this.quantidade == 1) {
            System.out.println("café bebido.");
            System.out.println("Mas sua xícara está vazia.");
            this.muitoQuente = false;
        } else if (this.muitoQuente) {
            System.out.println("Seu café está muito quente! espere mais um pouco para tomar.");
        } else {
            System.out.println("Café bebido.");
            this.muitoQuente = false;
        }
    }
}