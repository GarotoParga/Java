package POO.PROGRAMA09;

public class Professor extends Pessoa{
    private String espcialidade;
    private double salario;

    public void receberAumento(double aumento){
        this.setSalario(salario + aumento);
    }

    public String getEspcialidade() {
        return espcialidade;
    }

    public void setEspcialidade(String espcialidade) {
        this.espcialidade = espcialidade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
