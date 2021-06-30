package one.digitalinnovation.web.statics;

public class Programa {
    public static void main(String[] args){
        //o metodo estático altera todas isntancias nesse caso os dois retornos serao a da classe
        //se descomentar o pitbull os dois serao bipedes
        final Cachorro pitbull = new Cachorro();
        //pitbull.zoologia = "Bípede";

        final Cachorro viralatas = new Cachorro();

        System.out.println(pitbull.zoologia);
        System.out.println(viralatas.zoologia);

        //estatico nao precisa instanciar
        //se tirar o static da erro
        Cachorro.late();
    }
}

