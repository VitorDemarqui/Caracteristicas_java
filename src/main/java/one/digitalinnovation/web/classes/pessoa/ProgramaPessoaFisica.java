package one.digitalinnovation.web.classes.pessoa;

import jdk.swing.interop.SwingInterOpUtils;

public class ProgramaPessoaFisica {
    public static void main(String[] args){
        //chama classe que extende pessoa pode chamar itens da classe pessoa
        final PessoaFisica pessoaFisica = new PessoaFisica(33,100.5f);

        System.out.println(pessoaFisica.relatorio());

    }
}
