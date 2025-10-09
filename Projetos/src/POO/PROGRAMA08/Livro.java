package POO.PROGRAMA08;

public class Livro implements Publicacao {
    private String titulo;
    private String autor;
    private int totalPaginas;
    private int paginaAtual;
    private boolean aberto;
    private Pessoa leitor;

    public Livro(String titulo, String autor, Pessoa leitor) {
        this.setTitulo(titulo);
        this.setAutor(autor);
        this.setPaginaAtual(0);
        this.setTotalPaginas(100);
        this.setAberto(false);
        this.setLeitor(leitor);
    }

    public void detalhes() {
        System.out.println("Título: " + this.getTitulo());
        System.out.println("Autor: " + this.getAutor());
        System.out.println("Página atual: " + this.getPaginaAtual());
        System.out.println("Total de páginas: " + this.getTotalPaginas());
        System.out.println("Aberto: " + this.isAberto());
        System.out.println("Leitor: " + this.getLeitor().getNome());
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getTotalPaginas() {
        return totalPaginas;
    }

    public int getPaginaAtual() {
        return paginaAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setTotalPaginas(int totalPaginas) {
        this.totalPaginas = totalPaginas;
    }

    public void setPaginaAtual(int paginaAtual) {
        this.paginaAtual = paginaAtual;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    @Override
    public void abrir() {
        if (!this.isAberto()) {
            this.setAberto(true);
            System.out.println("Livro aberto com sucesso.");
        } else {
            System.out.println(" Impossível abrir! O livro já está aberto.");
        }
    }

    @Override
    public void fechar() {
        if (this.isAberto()) {
            this.setAberto(false);
            System.out.println("Livro fechado com sucesso.");
        } else {
            System.out.println("Impossível fechar! O livro já está fechado.");
        }
    }

    @Override
    public void folhear(int pagina) {
        if (this.isAberto()) {
           this.setPaginaAtual(pagina);
        } else {
            System.out.println("Impossível folhear! O livro está fechado.");
        }
    }

    @Override
    public void avancarPagina() {
        if (this.isAberto()) {
            this.setPaginaAtual(this.getPaginaAtual() + 1);
        } else {
            System.out.println("Impossível avançar página! O livro está fechado.");
        }
    }

    @Override
    public void voltarPagina() {
        if (this.isAberto()) {
            this.setPaginaAtual(this.getPaginaAtual() - 1);
        } else {
            System.out.println("Impossível voltar página! O livro está fechado.");
        }
    }

}