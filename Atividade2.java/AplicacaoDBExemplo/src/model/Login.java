package model;

public class Login {
    private int codigo;
    private String login;
    private String senha;
    private String permissao;

    public Login() {
    }

    public Login(int codigo, String login, String senha, String permissao) {
        this.codigo = codigo;
        this.login = login;
        this.senha = senha;
        this.permissao = permissao;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getPermissao() {
        return permissao;
    }

    public void setPermissao(String permissao) {
        this.permissao = permissao;
    }
    
}
