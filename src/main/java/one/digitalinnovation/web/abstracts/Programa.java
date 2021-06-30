package one.digitalinnovation.web.abstracts;

public class Programa {
    public static void main(String[] args){
        //final FormaGeometrica formaGeometrica = new FormaGeometrica();
        //nao deixa instanciar uma classe abstrata

        //conseguimos criar esse tipo/classe quadrado
        final FormaGeometrica quadrado = new Quadrado("quaq",22.1);

        System.out.println(quadrado.desenha(12,34));
        System.out.println(quadrado.nome());
        System.out.println(quadrado.area());



    }

}
