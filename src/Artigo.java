import java.util.Date;
import java.util.List;

public class Artigo {

    private int idArtigo;
    private String titulo;
    private String resumo;
    private List<String> autores;
    private Date dataResumo;
    private String artigo;     ///////Aqui tem que ser um arquivo, mas fica assim pra teste
    private Date dataArtigo;

    private int status;
    private LinhaDePesquisa eixo;

    public void setStatus(int status) {
        this.status = status;
    }

    public int getStatus() {
        return status;
    }

    public Artigo(){

    }

    public Artigo(LinhaDePesquisa eixoTematico, String _titulo, String _resumo, List<String> _autores){ //upa o resumo
        eixo = eixoTematico;
        titulo = _titulo;
        resumo = _resumo;
        autores = _autores;
        dataResumo = new Date();
        System.out.println(dataResumo);
    }

    public void submeteArtigo(String _artigo){
        artigo = _artigo;
        dataArtigo = new Date();
    }
}
