package one.digitalinnovation.web.classes.usuario;

public class SuperUsuario {

    private String login;
    private String senha;
    //esses atributos nao estao acessiveis fora dessa classe
    String nome;
    //caracteristicas dessa classe, atributos

    //construtor da classe, fala como vamos construir essa classe quando formos instanciar esta classe
    //e como passa os parametros
    public SuperUsuario(final String login, final String senha){
        this.login = login;
        this.senha = senha;
    }
    // getLogin nome do método, String o tipo de retorno, e retorna a senha
    public String getLogin(){
        return login;
    }
    protected String getSenha(){
        return senha;
    }
}
