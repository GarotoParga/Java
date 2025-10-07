package POO.PROGRAMA09;

public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();

        p1.toString("Carlos", 19, "Masculino");
        p2.toString("Gabriel", 15, "Masculino");
        p3.toString("karol", 37, "Feminino");
        p4.toString("Luís", 51, "Masculino");
    }
}
