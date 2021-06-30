package one.digitalinnovation.web.interfaces;

public interface Veiculo {
    //metodo abstrato
    String registro();

    //metodo ligar
    default void ligar(){
        System.out.println("Ligando veiculo!");
    }


    //void desligar();


}
