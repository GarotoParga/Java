package java.POO;
import java.text.DecimalFormat;

public class ContaBancaria {

    DecimalFormat df = new DecimalFormat("#,##0.00");

    String titular;
    private double saldo, saldoInBanco;
    private double emprestimo = 5000;
    private boolean emprestimoAtivo;
    private int contadorMes = 0;

    public ContaBancaria(String titular) {
        this.titular = titular;
        System.out.println("Conta do usuário criada.");
        System.out.println("Titular: " + this.titular);
        System.out.println("Saldo: R$" + df.format(this.saldo));
        System.out.println("Saldo em Banco: R$" + df.format(this.saldoInBanco));
        System.out.println("----------");
    }

    public void depositar() {
        if (this.saldo >= 1) {
            this.saldoInBanco = this.saldoInBanco + this.saldo;
            this.saldo = 0;
            System.out.println("Dinheiro depositado com sucesso.");
        } else {
            System.out.println("Você não possui saldo para depositar.");
        }
    }

    public void sacar() {
        if (this.saldoInBanco >= 1) {
            if (this.emprestimoAtivo) {
                this.saldo = this.saldoInBanco + this.emprestimo;
                this.emprestimo = 0;
                this.saldoInBanco = 0;
            }
            this.saldo = this.saldo + this.saldoInBanco;
            this.saldoInBanco = 0;
            System.out.println("Dinheiro retirado com sucesso.");
        } else {
            System.out.println("Você não possui saldo para sacar.");
        }
    }

    public void emprestimo() {
        if (this.saldoInBanco >= 5000) {
            this.emprestimoAtivo = true;
            System.out.println("Empréstimo adquirido com sucesso.");
        } else {
            this.emprestimoAtivo = false;
            System.out.println("O banco não tem uma oferta de empréstimo disponível para você.");
        }
    }

    public void trabalhar() {
        this.contadorMes++;
        double salario = 1400;
        this.saldo = this.saldo + salario;
        if (contadorMes > 1) {
            System.out.println("Você trabalhou mais um mês. Salário recebido foi de R$" + df.format(salario));
        } else {
            System.out.println("Você trabalhou " + contadorMes + " mês. Salário recebido foi de R$" + df.format(salario));
        }
    }

    public void status() {
        System.out.println("-----STATUS DO TITULAR-----");
        System.out.println("Titular: " + this.titular);
        System.out.println("Saldo: R$" + df.format(this.saldo));
        System.out.println("Saldo em Banco: R$" + df.format(this.saldoInBanco));
        if (this.emprestimoAtivo) {
            System.out.println("Saldo de empréstimo: " + df.format(this.emprestimo));
        } else {
            System.out.println("Não possui empréstimo com o banco.");
        }
    }
}
