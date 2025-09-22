package POO.PROGRAMA03;

public class Pessoa {
    public String nome;
    public float peso;
    public float altura;
    public float imc;

    public Pessoa(String n, float p, float a) {
        this.setNome(n);
        this.setPeso(p);
        this.setAltura(a);
        System.out.println("Nome: " + this.getNome());
        System.out.println("Peso: " + this.getPeso());
        System.out.println("Altura: " + this.getAltura());
        calcularImc();
    }


    private String getNome() {
        return nome;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    private float getPeso() {
        return peso;
    }

    private void setPeso(float peso) {
        this.peso = peso;
    }

    private float getAltura() {
        return altura;
    }

    private void setAltura(float altura) {
        this.altura = altura;
    }

    private float getImc() {
        return imc;
    }

    private void setImc(float imc) {
        this.imc = imc;
    }

    public void calcularImc() {
        this.setImc(this.getPeso() / (this.getAltura() * this.getAltura()));
        if (this.getImc() < 18.4) {
            System.out.println("Abaixo do peso.");
            System.out.println("IMC: " + this.getImc());
        } else if (this.getImc() >= 18.5 || this.getImc() <= 24.9) {
            System.out.println("Está no seu peso ideial.");
            System.out.println("IMC: " + this.getImc());
        } else if (this.getImc() > 24.9 || this.getImc() <= 40) {
            System.out.println("Está acima do peso.");
            System.out.println("IMC: " + this.getImc());
        } else {
            System.out.println("Isso já é impossível. Por favor passe dados corretos.");
        }
    }

}
