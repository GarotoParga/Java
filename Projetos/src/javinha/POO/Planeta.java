package javinha.POO;

public class Planeta {
    protected String nomePlaneta, corCeu;
    protected boolean agua;

    public Planeta(String nomePlaneta, String corCeu, boolean agua) {
        this.nomePlaneta = nomePlaneta;
        this.corCeu = corCeu;
        this.agua = agua;
        System.out.println("Planeta criado com sucesso.");
    }
    public void statusPlaneta(){
        System.out.println("O nome do planeta é: " + this.nomePlaneta);
        System.out.println("A cor do céu é: " + this.corCeu);

        if(this.agua){
            System.out.println("Seu planeta possui condições para se viver.");
            System.out.println("PLANETA HABITÁVEL.");
        }else{
            System.out.println("Seu planeta não possui condições para se viver.");
            System.out.println("PLANETA INABITÁVEL.");
        }
    }
}

