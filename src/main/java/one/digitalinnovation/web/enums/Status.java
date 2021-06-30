package one.digitalinnovation.web.enums;

public enum Status {
    //ATRIBUTOS ENUM
    OPEN(13,"Aberto"),
    CLOSE(02,"Fechado");

    private int cod;
    private String texto;

    //construtor privado
    //constroi o nosso enum
    Status(final int cod, final String texto){
        this.cod = cod;
        this.texto = texto;
    }

    public int getCod(){return cod;}
    public  String getTexto(){return texto;}


}