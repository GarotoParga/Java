package POO.PROGRAMA10;

public class Bolsista extends Aluno{
    private float bolsa;

    public void renovarBolsa(){
        System.out.println("Bolsa renovada.");
    }

    @Override
    public void pagarMensalidade() {
        System.out.println("O pagamento da mensalidade é gratuito.");
    }

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
}
