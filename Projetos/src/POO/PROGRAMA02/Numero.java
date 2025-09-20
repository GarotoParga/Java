package POO.PROGRAMA02;

public class Numero {
    private int valor;

    public Numero(int n){
        this.setNumm(n);
        imparOuPar();
    }

    private int getNum() {
        return valor;
    }

    private void setNumm(int n) {
        this.valor = n;
    }

    public void imparOuPar() {
        if (this.getNum() % 2 == 0) {
            System.out.println("O número " + this.getNum() + " é Par.");
        } else {
            System.out.println("O número " + this.getNum() + " é Ímpar.");
        }
    }
}
