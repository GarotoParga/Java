package POO.PROGRAMA04;

public class Tabuada {
    private int numeroEscolhido;
    private int resul;

    public int getNumeroEscolhido() {
        return numeroEscolhido;
    }

    public void setNumeroEscolhido(int numeroEscolhido) {
        this.numeroEscolhido = numeroEscolhido;
    }

    public int getResul() {
        return resul;
    }

    public void setResul(int resul) {
        this.resul = resul;
    }

    public void somar(int n) {
        this.setNumeroEscolhido(n);
        for (int i = 1; i <= 10; i++) {
            this.setResul(this.getNumeroEscolhido() + i);
            System.out.println(this.getNumeroEscolhido() + " + " + i + " = " + this.getResul());
        }
        System.out.println("--------------------");
    }

    public void subtrair(int n) {
        this.setNumeroEscolhido(n);
        for (int i = 1; i <= 10; i++) {
            this.setResul(this.getNumeroEscolhido() - i);
            System.out.println(this.getNumeroEscolhido() + " - " + i + " = " + this.getResul());
        }
        System.out.println("--------------------");
    }

    public void multiplicar(int n) {
        this.setNumeroEscolhido(n);
        for (int i = 1; i <= 10; i++) {
            this.setResul(this.getNumeroEscolhido() * i);
            System.out.println(this.getNumeroEscolhido() + " X " + i + " = " + this.getResul());
        }
        System.out.println("--------------------");
    }

    public void dividir(int n) {
        this.setNumeroEscolhido(n);
        for (int i = 1; i <= 10; i++) {
            double resulDivi = (double) this.getNumeroEscolhido() / i;
            System.out.printf("%d / %d = %.1f%n", this.getNumeroEscolhido(), i, resulDivi);
        }
        System.out.println("--------------------");
    }


}
