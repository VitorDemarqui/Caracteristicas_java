package one.digitalinnovation.web.classes.usuario;

public class ProgramaSuperUsuario {

    public static void main(String[] args){
        //cria usuario passando senha e login
    final var superUsuario = new SuperUsuario("root", "1234");

    //acessando os metodos
    superUsuario.getLogin();
    superUsuario.getSenha();

    //acessando parametros pq é default
    String root = superUsuario.nome;
    }

}
