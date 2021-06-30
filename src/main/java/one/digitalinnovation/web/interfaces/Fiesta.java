package one.digitalinnovation.web.interfaces;

public class Fiesta implements Carro,Veiculo{
    //sobrescreve o metodo das duas carro e veiculo

    @Override
    public String marca() {
        return "Ford";
    }

    @Override
    public String registro() {
        return "12315SDFHUA45";
    }

    @Override
    public void ligar() {
        Carro.super.ligar();
        Veiculo.super.ligar();
    }
}
