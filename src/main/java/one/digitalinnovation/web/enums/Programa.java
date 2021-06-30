package one.digitalinnovation.web.enums;

import org.w3c.dom.ls.LSOutput;

public class Programa {

    public static void main(String[] args){
        //não é possivel instanciar enum
        //final TipoVeiculo tipoVeiculo = new TipoVeiculo();

        //acessando de forma statica
        System.out.println(TipoVeiculo.TERRESTRE);
        System.out.println(TipoVeiculo.AQUATICO);

        //construindo enum a partir de valor
        //o valor tem que existir
        System.out.println(TipoVeiculo.valueOf("AEREO"));

        for (TipoVeiculo tipo : TipoVeiculo.values()) {
            System.out.println("Tipo" + tipo);
        }

        System.out.println("Codigo status close "+Status.CLOSE.getCod());
        System.out.println("Codigo status close " +Status.OPEN.getTexto());




    }
}
