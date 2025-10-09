package POO.PROGRAMA12;

public class Main {
    public static void main(String[] args) {
        // Videos 
        Video canalDeClash = new Video("Como dar três corôas no Clash Royale!"); 
        Video receitasCaseiras = new Video("Como fazer suco de banana sem banana!"); 
        
        // Usuarios
        Usuario user01 = new Usuario("Davi", 11, "Masculino");
        Usuario user02 = new Usuario("Marta", 25, "Feminino");


        // Comandos 
        user01.fazerLogin();
        user01.AssistirVideo(canalDeClash);
        user01.like(canalDeClash);
        user01.comentar(canalDeClash, "Vídeo bom demais! Ce loko, consegui ganhar todas do meu irmão, Valeu chefe!");
        canalDeClash.detalhes();
        // user02.fazerLogin();
        // user02.AssistirVideo(receitasCaseiras);
        // user02.like(receitasCaseiras);
        // user02.comentar(receitasCaseiras, "Muito boa a receita!");
        // receitasCaseiras.detalhes();

    }
}
