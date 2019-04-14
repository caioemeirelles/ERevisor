public class FuncionarioConcreto implements FabricaDeUsuario{
    private int id;
    private String nome;
    private String email;
    private String senha;

    @Override
    public boolean pedePermissao(){
        /*Precisa fazer override em quem extender essa classe*/
        return false;
    }

    public FuncionarioConcreto() {
        id = 0;
        nome = null;
        email = null;
        senha = null;
    }

    public FuncionarioConcreto(int _id, String _nome, String _email, String _senha){
        id = _id;
        nome = _nome;
        email = _email;
        senha = _senha;
    }

    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getNome() {
        return nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
