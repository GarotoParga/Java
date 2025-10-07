package POO.PROGRAMA09;

public class Aluno extends Pessoa {
    private boolean matriculla;
    private String curso;

    public void cancelarMatricula() {
        System.out.println("Matrícula cancelada!");
    }

    public boolean isMatriculla() {
        return matriculla;
    }

    public void setMatriculla(boolean matriculla) {
        this.matriculla = matriculla;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
