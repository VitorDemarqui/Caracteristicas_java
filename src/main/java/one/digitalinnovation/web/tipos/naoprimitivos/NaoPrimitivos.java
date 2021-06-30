package one.digitalinnovation.web.tipos.naoprimitivos;

public class NaoPrimitivos {
    public static void main(String[] args){
        //tudo que é objeto/tipo nao sao primitivos

        String texto = "Meu texto para apresentação"; //Sequencia de caracteres
        Void v; //TIpo Válido, classe vazia

        Object o = new Object(); //é o objeto principal do java, todos outros objetos extenden objects

        Number numero = Integer.valueOf(100); //INTEGER EXTENDE NUMBER
        numero.toString();


    }
}
