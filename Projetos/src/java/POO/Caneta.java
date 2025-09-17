package java.POO;

public class Caneta {
    private String modelo;
    private String cor;
    private float ponta;
    private int carga = 100;
    private boolean tampada = true;

    public Caneta(String modelo, String cor, float ponta) {
        this.modelo = modelo;
        this.cor = cor;
        this.ponta = ponta;
//        System.out.println("Caneta criada.");
//        System.out.println("Modelo: " + this.modelo);
//        System.out.println("Cor: " + this.cor);
//        System.out.println("Ponta: " + this.ponta);
//        System.out.println("Carga: " + this.carga +"%");
//        System.out.println("----------");
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public float getPonta() {
        return ponta;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    protected void rabiscar() {
        if (this.tampada) {
            System.out.println("Você não pode rabiscar, pois sua caneta está tampada! Retire a tampa primeiro.");
        } else if (this.carga <= 1) {
            System.out.println("Sua caneta não pode rabiscar. Precisa de recarga!");
            System.out.println("Carga: " + this.carga +"%");
        } else if (this.carga <= 20) {
            this.carga = this.carga - 20;
            System.out.println("Sua caneta rabiscou! Mas está precisando de recarga.");
            System.out.println("Carga: " + this.carga +"%");
        } else {
            this.carga = this.carga - 20;
            System.out.println("Sua caneta rabiscou!");
            System.out.println("Carga: " + this.carga +"%");
        }
    }

    protected void tampar() {
        if (this.tampada) {
            System.out.println("Sua caneta já está tampada.");
        } else {
            this.tampada = true;
            System.out.println("Caneta tampada com sucesso.");
        }
    }

    protected void destampar() {
        if (this.tampada) {
            this.tampada = false;
            System.out.println("Caneta destampada com sucesso.");
        } else {
            System.out.println("Sua caneta já está destampada.");
        }
    }

    protected void recarregar() {
        this.carga = 100;
        System.out.println("Caneta recarregada com sucesso.");
        System.out.println("Carga: " + this.carga +"%");
    }

    public void status(){
        System.out.println("Status");
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga +"%");
        System.out.println("----------");
    }
}
