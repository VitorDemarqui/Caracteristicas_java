package one.digitalinnovation.web.abstracts;

public abstract class FormaGeometrica {
    // é uma ideia de uma classe
    //um metodo abstrato nao ter corpo
    //se tem um metodo abstract a classe tem que ser abstrata tambem
    public abstract  String nome();
    public abstract  Double area();

    public String desenha(int x, int y){
        return  "denhando nas coordenadas X: "+x+"Y: "+y;
    }
}
