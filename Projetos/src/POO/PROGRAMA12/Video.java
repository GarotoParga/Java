package POO.PROGRAMA12;

import java.util.ArrayList;
import java.util.List;

public class Video implements AcoesVideo {
    protected String titulo;
    protected List<String> avaliacao;
    protected int views;
    protected List<Usuario> espectadores;
    protected int curtidas;
    protected boolean reproduzindo;

    public Video(String titulo) { // Construtor
        this.setTitulo(titulo);
        this.espectadores = new ArrayList<>();
        this.avaliacao = new ArrayList<>();
    }

    public void detalhes() { // Imprimir detalhes do vídeo
        System.out.println("---------- Detalhes Do Vídeo ----------");
        System.out.println("Title: " + this.getTitulo());
        System.out.println("Views: " + this.getViews());
        System.out.println("Likes: " + this.getCurtidas());
        if (!this.getAvaliacao().isEmpty()) {
            System.out.println("Comentários: " + avaliacao.size());
            System.out.println("---------- Comentários ----------");
            for (String comentario : avaliacao) {
                System.out.println(comentario);
            }
        }
    }

    public void adiconarEspectador(Usuario espectador) { // Adiciona espectadores na lista
        this.espectadores.add(espectador);
        this.setViews(espectadores.size());
    }

    public void exibirEspectadores() { // Exibe os especatdores (nome, idade, sexo)
        if (espectadores.isEmpty()) {
            System.out.println("Não possui espectadores!");
        } else {
            System.out.println("---------- Espectadores ----------");
            int i = 1;
            for (Usuario espectador : espectadores) {
                System.out.println(i + "-ESPECTADOR");
                System.out.println("Nome: " + espectador.getNome());
                i++;
            }
        }
    }

    @Override
    public void play() {
        if (!this.isReproduzindo()) {
            this.setReproduzindo(true);
        }
    }

    @Override
    public void pause() {
        if (this.isReproduzindo()) {
            this.setReproduzindo(false);
        }
    }

    @Override
    public void like() {
        if (views > 0) {
            this.setCurtidas(curtidas + 1);
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public List<String> getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(String comnetario) {
        avaliacao.add(comnetario);
    }

    public List<Usuario> getEspectadores() {
        return espectadores;
    }

    public void setEspectadores(List<Usuario> espectadores) {
        this.espectadores = espectadores;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public boolean isReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }

}
