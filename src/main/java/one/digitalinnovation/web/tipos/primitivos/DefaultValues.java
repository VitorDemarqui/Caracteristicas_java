package one.digitalinnovation.web.tipos.primitivos;

public class DefaultValues {
    public static void main(String[] args){
        final Default d = new Default();

        System.out.println(d.getI());

        System.out.println(d.isActive());
    }
}

class Default{
    //parametro
    int i;
    boolean active;


    public int getI(){
        return i;
    }

    public  boolean isActive(){
        return active;
    }
}
