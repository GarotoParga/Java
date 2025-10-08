package POO.PROGRAMA12;

import java.util.List;

public class Video implements AcoesVideo {
    protected String titulo;
    protected String Avaliacao;
    protected int views;
    protected List<Garfanhoto> espectadores;
    protected int curtidas;
    protected boolean reproduzindo;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAvaliacao() {
        return Avaliacao;
    }

    public void setAvaliacao(String avaliacao) {
        Avaliacao = avaliacao;
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

    public List<Garfanhoto> getEspectadores() {
        return espectadores;
    }

    public void setEspectadores(List<Garfanhoto> espectadores) {
        this.espectadores = espectadores;
    }

    @Override
    public void play() {
        if (!this.isReproduzindo()) {
            this.setReproduzindo(true);
            System.out.println("O vídeo está reproduzindo...");
        }
    }

    @Override
    public void pause() {
        if (this.isReproduzindo()) {
            this.setReproduzindo(false);
            System.out.println("O vídeo foi pausado.");
        }
    }

    @Override
    public void like() {

    }
}
