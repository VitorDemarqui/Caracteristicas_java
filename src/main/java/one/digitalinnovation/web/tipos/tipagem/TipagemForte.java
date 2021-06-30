package one.digitalinnovation.web.tipos.tipagem;

public class TipagemForte {
    public static void main(String[] args){
        //uma vez que atribui um tipo a uma variavel nao consigo muda-lo
        //criar um int e atribuir uma String por exemplo

        String texto = "meu texto";

        //texto = 1000; //NOK

        Integer numero = 1024;

        numero = 512; //ok
    }

}
