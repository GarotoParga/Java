package POOI.PROGRAMA01;

public class ControleRemoto implements Controlador {
    private int volume;
    private boolean ligado;
    private boolean tocando;

    public ControleRemoto() {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }

    private int getVolume() {
        return volume;
    }

    private void setVolume(int v) {
        volume = v;
    }

    private boolean isLigado() {
        return ligado;
    }

    private void setligado(boolean l) {
        ligado = l;
    }

    private boolean getTocando() {
        return tocando;
    }

    private void setTocando(boolean t) {
        tocando = t;
    }

    @Override
    public void ligar() {
        if (this.isLigado()) {
            System.out.println("A TV já está ligada.");
        } else {
            this.setligado(true);
            System.out.println("TV ligada com sucesso.");
        }
    }

    @Override
    public void desligar() {
        if (!this.isLigado()) {
            System.out.println("A TV já está desligada.");
        } else {
            this.setligado(false);
            System.out.println("TV desligada com sucesso.");
        }
    }

    @Override
    public void abrirMenu() {
        if (this.isLigado()) {
            System.out.println("-----MENU-----");
            System.out.println("Está ligado? " + this.isLigado());
            System.out.println("Está tocando? " + this.getTocando());
            System.out.println("Volume: " + this.getVolume());
            for (int i = 0; i <= this.getVolume(); i += 10) {
                System.out.print("♫");
            }
        } else {
            System.out.println("Tv desligada. Impossível abrir Menu.");
        }
    }

    @Override
    public void fecharMenu() {
        if (this.isLigado()) {
            System.out.println("Menu fechado com sucesso.");
        } else {
            System.out.println("Tv desligada. Impossível fechar Menu.");
        }

    }

    @Override
    public void maisVolume() {
        if (this.isLigado()) {
            this.setVolume(this.getVolume() + 5);
        } else {
            System.out.println("TV desligada. Impossível aumentar volume.");
        }
    }

    @Override
    public void menosVolume() {
        if (this.isLigado()) {
            this.setVolume(this.getVolume() - 5);
        } else {
            System.out.println("TV desligada. Impossível diminuir volume.");

        }
    }

    @Override
    public void ligarMudo() {
        if (this.isLigado() && this.getVolume() > 0) {
            this.setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if (this.isLigado() && this.getVolume() <= 0) {
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
        if (this.isLigado() && !this.getTocando()) {
            this.setTocando(true);
            System.out.println("Tocando...");
        }
    }

    @Override
    public void pause() {
        if (this.isLigado() && this.getTocando()) {
            this.setTocando(false);
            System.out.println("Pausado.");
        }

    }
}

