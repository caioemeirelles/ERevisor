public class Editor  extends Usuario {

    public void Editor() {
        tipo = "Editor";
        pedePermissao();
    }

    public static void criaLinhaDePesquisa(String _nome){
        LinhaDePesquisa.criaLinhaPesquisa(_nome);
    }
}