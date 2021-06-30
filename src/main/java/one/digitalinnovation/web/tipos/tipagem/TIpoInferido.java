package one.digitalinnovation.web.tipos.tipagem;

public class TIpoInferido {
    public static void main(String[] args){
    //consigo criar variaveis, atribuir valores sem falar qual é o tipo, o compilado sabe o que quer por dentro
    //continua sendo tipagem forte

        var numero = Integer.valueOf("123456");

        var texto = "O numero e :";

        System.out.printf(texto + numero);
    }
}
