package POO.PROGRAMA09;

public class Pessoa {
    private String nome;
    private int idade;
    private String sexo;

    public void toString(String nome, int idade, String sexo) {
        System.out.println("Nome: " + nome + ". Idade: "+  idade + ". Sexo: " + sexo);
    }

    public void fazerAniversario(){
        this.setIdade(idade ++);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}
