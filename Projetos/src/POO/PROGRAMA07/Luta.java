package POO.PROGRAMA07;

import java.util.Objects;

public class Luta {
    private Lutador desafiante, desafiado;
    private int rounds;
    private boolean aprovada;


    public void marcarLuta(Lutador l1, Lutador l2) {
        if (Objects.equals(l1.getCategoria(), l2.getCategoria()) && l1 != l2) {
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
            this.getDesafiado().apresentar();
            this.getDesafiante().apresentar();
            
        } else {
            System.out.println("Luta não não pode acontecer! ");
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
