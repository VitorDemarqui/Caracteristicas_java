package one.digitalinnovation.web.abstracts;

public class Quadrado extends  FormaGeometrica{

    private String nome;
    private Double area;

    //construtor do quadrado
    public Quadrado(final String nome, final Double area){
        this.nome = nome;
        this.area = area;
    }

    //a ide exige que faça a sobrescrita desses metodos
    @Override
    public String nome() {
        return nome;
    }

    @Override
    public Double area() {
        return area;
    }

    @Override
    public String toString(){
        final String builder = "Quadrado[" + "nome ="+nome+" area = "+area+"]";
        return  builder;
    }


}
