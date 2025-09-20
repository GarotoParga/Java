package POOI.PROGRAMA02;

public class Carro implements Veiculo {
    private boolean ligado;
    private int velocidade;
    private boolean nitro;

    public Carro() {
        this.ligado = false;
        this.velocidade = 0;
        this.setNitro(false);
    }

    private boolean isLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private int getVelocidade() {
        return velocidade;
    }

    private void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    private boolean isNitro() {
        return nitro;
    }

    private void setNitro(boolean nitro) {
        this.nitro = nitro;
    }

    @Override
    public void ligar() {
        if (!this.isLigado()) {
            this.setLigado(true);
            System.out.println("Carro ligado com sucesso.");
        } else {
            System.out.println("O carro já está ligado.");
        }
    }

    @Override
    public void desligar() {
        if (this.isLigado() && this.getVelocidade() == 0) {
            this.setLigado(false);
            this.setNitro(false);
            System.out.println("Carro desligado com sucesso.");
        } else if (this.isLigado() && this.getVelocidade() > 0) {
            System.out.println("Seu carro ainda está em movimento. Pare ele primeiro.");
        } else {
            System.out.println("Seu carro já está desligado.");
        }
    }

    @Override
    public void acelerar() {
        if (this.isLigado() && this.isNitro()) {
            this.setVelocidade(this.getVelocidade() * 2);
            System.out.println("Carro acelerando... E 2X mais rápido com Nitro.");
        } else if (this.isLigado()) {
            this.setVelocidade(this.getVelocidade() + 50);
            System.out.println("Carro acelerando...");
        } else {
            System.out.println("Seu carro está desligado. Ligue ele primeiro");
        }
    }

    @Override
    public void freiar() {
        if (this.isLigado() && this.getVelocidade() > 0) {
            this.setVelocidade(this.getVelocidade() - 50);
            System.out.println("Carro freiando...");
        } else if (this.isLigado() && this.velocidade == 0) {
            System.out.println("Não adianta freiar, pois seu carro está parado. ");
        } else {
            System.out.println("Não adianta freiar, pois seu carro está desligado.");
        }
    }

    @Override
    public void usarNitro() {
        if (this.isLigado() && this.getVelocidade() >= 100) {
            this.setNitro(true);
            this.setVelocidade(this.getVelocidade() * 2);
            System.out.println("Nitro ativado. Seu carro está 2X mais veloz.");
        } else if (this.isLigado() && this.getVelocidade() < 100) {
            System.out.println("Seu carro ainda não atingiu a velocidade necessária para ativa o Nitro.");
        } else {
            System.out.println("Impossível usar o Nitro, o carro está desligado.");
        }
    }

    public void statusCarro() {
            System.out.println("-----STATUS-----");
        if (this.isLigado() && this.isNitro()) {
            System.out.println("Carro ligado com Nitro ativado.");
        } else if (this.isLigado() && !this.isNitro()) {
            System.out.println("Carro ligado com Nitro desativado.");
        } else {
            System.out.println("Carro desligado.");
        }
        System.out.println("VELOCIDADE: " + this.getVelocidade() + "Km/h.");
    }
}
