package one.digitalinnovation.web.finals;

public class Programa {
    public static void main(String[] args){
        final HardCoreGamer hardCoreGamer = new HardCoreGamer();

        final Gamer gamer= new Gamer();

        final CasualGamer casualGamer = new CasualGamer();

        // variaveis final nao podem ser alteradas, nao deixa mudar o valor da variavel ou metodo
        final var game = "PUBG";
        //game = "WOW"

        System.out.println(casualGamer.play(game));


    }

}
