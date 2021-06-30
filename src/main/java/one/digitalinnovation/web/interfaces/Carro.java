package one.digitalinnovation.web.interfaces;
//aqui uma interface extende outra interface
public interface Carro extends Automovel{
    //marca é uma classe abstrata
    String marca();
    //método ligar
    default void ligar(){
        System.out.println("Ligando o carro");
    }
    //adiciando metodos abstratos quebra a implementação, já os métodos comuns nao quebram
    default  String codigoRenavan(){
        return "415644sad";
    }
}
