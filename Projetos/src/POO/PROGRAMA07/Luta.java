package POO.PROGRAMA07;

import java.util.Random;

public class Luta {
    private Lutador desafiante, desafiado;
    private int rounds;
    private boolean aprovada;


    public void marcarLuta(Lutador l1, Lutador l2) {
        if (l1.getCategoria().equals(l2.getCategoria()) && l1 != l2) {
            this.setAprovada(true);
            this.desafiado = l1;
            this.desafiante = l2;
        } else {
            this.setAprovada(false);
            this.desafiado = null;
            this.desafiante = null;
        }
    }

    public void lutar() {
        if (this.isAprovada()) {
            System.out.println("-----DESAFIADO-----");
            this.getDesafiado().apresentar();
            System.out.println("-----DESAFIANTE-----");
            this.getDesafiante().apresentar();

            Random aleatorio = new Random();

            int vencedor = aleatorio.nextInt(3);
            System.out.println("-----RESULTADO-----");
            switch (vencedor) {
                case 0:
                    // Empate
                    System.out.println("EMPATOU LUTA!");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                case 1:
                    // Vitória do Desafiado
                    System.out.println("Vitória do " + this.desafiado.getNome());
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                case 2:
                    // Vitória do Desafiante
                    System.out.println("Vitória do " + this.desafiante.getNome());
                    this.desafiado.perderLuta();
                    this.desafiante.ganharLuta();
            }
            System.out.println("----------");
        } else {
            System.out.println("A luta não pode acontecer! ");
        }
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

}
