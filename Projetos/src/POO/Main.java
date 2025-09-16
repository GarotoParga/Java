package POO;

public class Main {
    public static void main(String[] args) {
        ContaBancaria user01 = new ContaBancaria("Davi");
        user01.trabalhar();
        user01.trabalhar();
        user01.trabalhar();
        user01.trabalhar();
        user01.trabalhar();
        user01.depositar();
        user01.status();
        user01.emprestimo();
        user01.status();
        user01.sacar();
        user01.status();

    }

}
