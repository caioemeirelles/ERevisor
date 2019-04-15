import java.util.List;

public class Autor extends Usuario {

    private Artigo artigo;
    private String inscricao;

    public void Autor(){
        tipo = "Autor";
        pedePermissao();

    }

    public void submeteResumo(LinhaDePesquisa eixoTematico, String _titulo, String _resumo, List<String> _autores){
        artigo = new Artigo(eixoTematico, _titulo, _resumo, _autores);
    }

    public void submeteInscricao(String _inscricao){
        if (_inscricao != null)
            inscricao = _inscricao;
    }

    public void submeteArtigo(String _artigo){
        if (isInscrito())
            artigo.submeteArtigo(_artigo);
    }

    public boolean isInscrito(){
        if(inscricao != null)
            return true;
        return false;
    }
}
