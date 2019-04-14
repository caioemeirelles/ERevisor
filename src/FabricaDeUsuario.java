public interface FabricaDeUsuario {
    boolean pedePermissao();

    int getId();

    String getEmail();

    String getNome();

    String getSenha();

    void setEmail(String email);

    void setId(int id);

    void setNome(String nome);

    void setSenha(String senha);


}
