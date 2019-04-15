import java.util.Scanner;

public class Revisor extends Usuario {

    public Revisor(){
            tipo = "Revisor";
            pedePermissao();
    }

    public void revisaArtigo(Artigo artigo){
        try (Scanner leitor = new Scanner(System.in)) {

            artigo.setStatus(leitor.nextInt());
        }

    }

}
