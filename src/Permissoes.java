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

    private List<Boolean> permissoesAutor(){
        List<Boolean> list = new ArrayList<>();
        list.add(false);     //editarEixoTematico);
        list.add(false);     //editarRevisor);
        list.add(false);     //editarStatusArtigo);
        list.add(false);     //verArtigos);
        list.add(false);     //verPagamento);
        return list;
    }
    private List<Boolean> permissoesRevisor(){
        List<Boolean> list = new ArrayList<>();
        list.add(false);     //editarEixoTematico);
        list.add(false);     //editarRevisor);
        list.add(true);     //editarStatusArtigo);
        list.add(false);     //verArtigos);
        list.add(false);     //verPagamento);
        return list;
    }
    private List<Boolean> permissoesEditor(){
        List<Boolean> list = new ArrayList<>();
        list.add(true);     //editarEixoTematico);
        list.add(true);     //editarRevisor);
        list.add(true);     //editarStatusArtigo);
        list.add(true);     //verArtigos);
        list.add(true);     //verPagamento);
        return list;
    }

    protected List<Boolean> getPermissao(SessionFactory session){
        List<Boolean> list = new ArrayList<>();
        if (session.tipo.equals("autor"))
            return permissoesAutor();
        else if (session.tipo.equals("revisor"))
            return permissoesRevisor();
        else if (session.tipo.equals("editor"))
            return permissoesEditor();

        return null;
    }
}
