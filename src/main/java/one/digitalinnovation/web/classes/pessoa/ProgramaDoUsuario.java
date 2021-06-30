package one.digitalinnovation.web.classes.pessoa;

import one.digitalinnovation.web.classes.usuario.SuperUsuario;

public class ProgramaDoUsuario {
    public static void main(String[] args){
        final var batman = new SuperUsuario("batman","123123");

        batman.getLogin();

        //batman.getSenha(); //ERRO MODIFICADOR É PROTECTED TA EM OUTRO PACOTE

        //String nomeDoCliente = batman.nome;//ERRO PUBLICO SO PRA QUEM TA NO MEMSO PACOTE

    }
}
