public class FabricaDeUsuario {
    private int id;
    private String nome;
    private String email;
    private String senha;

    public FabricaDeUsuario(){
        id = 0;
        nome = null;
        email = null;
        senha = null;
    }

    public FabricaDeUsuario(int _id, String _nome, String _email, String _senha){
        id = _id;
        nome = _nome;
        email = _email;
        senha = _senha;
    }

}
