package one.digitalinnovation.web.interfaces;

public class Gol implements Carro{
    //nao sobrescreve metodo deafult pois é herdado
    // quando classe implementa algo ele vira aquele algo
    @Override
    public String marca() {
        return "Volkswagen";
    }
}
