/*Padrao implementado: Singleton*/

import java.util.List;
import java.util.ArrayList;

class Permissoes {
    private static Permissoes ourInstance = new Permissoes();

    protected static Permissoes getInstance() {
        return ourInstance;
    }

    private Permissoes() {
    }

    private static List<Boolean> permissoesAutor(){
        List<Boolean> list = new ArrayList<>();
        list.add(false);     //editarEixoTematico);
        list.add(false);     //editarRevisor);
        list.add(false);     //editarStatusArtigo);
        list.add(false);     //verArtigos);
        list.add(false);     //verPagamento);
        return list;
    }
    private static List<Boolean> permissoesRevisor(){
        List<Boolean> list = new ArrayList<>();
        list.add(false);     //editarEixoTematico);
        list.add(false);     //editarRevisor);
        list.add(true);      //editarStatusArtigo);
        list.add(false);     //verArtigos);
        list.add(false);     //verPagamento);
        return list;
    }
    private static List<Boolean> permissoesEditor(){
        List<Boolean> list = new ArrayList<>();
        list.add(true);     //editarEixoTematico);
        list.add(true);     //editarRevisor);
        list.add(true);     //editarStatusArtigo);
        list.add(true);     //verArtigos);
        list.add(true);     //verPagamento);
        return list;
    }

    protected static List<Boolean> getPermissao(String tipo){
        List<Boolean> list = new ArrayList<>();
        if (tipo.equals("autor"))
            return permissoesAutor();
        else if (tipo.equals("revisor"))
            return permissoesRevisor();
        else if (tipo.equals("editor"))
            return permissoesEditor();

        return null;
    }
}
