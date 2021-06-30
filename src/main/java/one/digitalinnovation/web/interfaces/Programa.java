package one.digitalinnovation.web.interfaces;

public class Programa {
    public static void main(String[] args){

        final Gol gol = new Gol();
        //póde ser tambe final Carro gol = new Gol();
        //o gol é um carro alem de gol
        //como a segunda classe
        System.out.println("Marca do GOl: "+gol.marca());
        gol.ligar();

        //alem de Trator pode ser Veiculo tambem  ex:
        //final Veiculo trator = new Trator();
        final Trator trator = new Trator();
        System.out.println("Registro do Trator: "+trator.registro());
        trator.ligar();

        //estes dois vao dar erros pois um nao possui registro e outro nao possui marca, e
        // ntao ele tem que utilizar os rpoprios metodos
        //final Carro fiesta = new Fiesta();
        //final Veiculo fiesta = new Fiesta();
        final Fiesta fiesta = new Fiesta();

        System.out.println("Marca do Fiesta"+ fiesta.marca());
        System.out.println("Registro do Fiesta"+ fiesta.registro());

        //printa os dois pois sobrescrevemos os dois metodos
        fiesta.ligar();

        //Carro.super.ligar(); //só pode ser acessado por quem a implementa
    }

}
