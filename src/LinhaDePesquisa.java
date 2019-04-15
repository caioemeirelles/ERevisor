import java.util.ArrayList;
import java.util.List;

class LinhaDePesquisa {
    private static LinhaDePesquisa ourInstance = new LinhaDePesquisa();

    private LinhaDePesquisa(){
    }

    protected static LinhaDePesquisa getInstance() {
        return ourInstance;
    }

    private static List<String> nomes = new ArrayList<>();

    public static void criaLinhaPesquisa(String nome){
        nomes.add(nome);
    }

}
