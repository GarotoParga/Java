package POO.PROGRAMA12;

import java.util.ArrayList;
import java.util.List;

public class Usuario extends Pessoa {
    protected boolean login;
    protected int totalAssistido;
    protected List<Video> videos;
    protected List<String> meusComentarios;
    protected List<Video> videosCurtidos;

    public Usuario(String nome, int idade, String sexo) {
        this.setNome(nome);
        this.setIdade(idade);
        this.setSexo(sexo);
        this.videos = new ArrayList<>();
        this.videosCurtidos = new ArrayList<>();
        this.meusComentarios = new ArrayList<>();
    }

    public void fazerLogin() {
        if (!login) {
            this.setLogin(true);
        }
    }

    public void fazerLogout() {
        if (login) {
            this.setLogin(false);
        }
    }

    public void AssistirVideo(Video video) {
        if (login) {
            System.out.println("O usuário " + this.getNome() + " está Assistindo... "  + video.getTitulo());
            video.adiconarEspectador(this);
            this.videos.add(video);
            this.setTotalAssistido(this.getVideos().size());
            ganharExperiencia();
        } else {
            System.out.println("Precisa fazer login primeiro.");
        }
    }

    public void like(Video video) {
        System.out.println(this.getNome() + " curtiu o vídeo: " + video.getTitulo());
        video.like();
        this.setVideosCurtidos(video);
        video.espectadores.add(this);
    }

    public void comentar(Video video, String comentario) {
        if (login) {
            System.out.println(this.getNome() + " comentou no vídeo: " + video.getTitulo());
            this.meusComentarios.add(comentario + " no vídeo: " + video.getTitulo());
            String comentarios = (this.getNome() + ": " + comentario);
            video.setAvaliacao(comentarios);
        } else {
            System.out.println("Precisa fazer login!");
        }
    }

    public void detalhes() {
        System.out.println("--------- Dados do Usuário ----------");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Idade : " + this.getIdade());
        System.out.println("Sexo : " + this.getSexo());
        if (!this.videosCurtidos.isEmpty()) {
            System.out.println("---------- Vídeos Curtidos ----------");
            int i = 1;
            for (Video video : videosCurtidos) {
                System.out.println(i + " Vídeo: " + video.getTitulo());
                i++;
            }
        }
    }

    @Override
    public void ganharExperiencia() {
        if (!login || videos.isEmpty()) {
            System.out.println("Precisa assistir um vídeo para ganhar experiência.");
        } else {
            this.setExperiencia(experiencia + 10);
        }
    }

    public boolean isLogin() {
        return login;
    }

    public void setLogin(boolean login) {
        this.login = login;
    }

    public int getTotalAssistido() {
        return totalAssistido;
    }

    public void setTotalAssistido(int totalAssistido) {
        this.totalAssistido = totalAssistido;
    }

    public List<Video> getVideos() {
        return videos;
    }

    public void setVideos(List<Video> videos) {
        this.videos = videos;
    }

    public String getMeusComentarios(int comentario) {
        return meusComentarios.get(comentario);
    }

    public void setMeusComentarios(String meusComentarios) {
        this.meusComentarios.add(meusComentarios);
    }

    public Video getVideosCurtidos(int video) {
        return videosCurtidos.get(video);
    }

    public void setVideosCurtidos(Video videosCurtidos) {
        this.videosCurtidos.add(videosCurtidos);
    }

}
