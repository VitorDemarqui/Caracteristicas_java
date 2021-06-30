package one.digitalinnovation.web.tipos.naoprimitivos;

public class Unboxing {
    public static void main(String[] args){
        //UNBOXING É UTILIZAR UM WRAPPER PARA ATRIBUIR A UM TIPO PRIMITIVO

        //criar um novo integer passando valor 3 e atribui ao tipo primitivo, foi depreciado
        //int i = new Integer(3);

        //novo utilitário, atribuindo a um tipo primitivo
        int inteiro = Integer.valueOf(1024);

        //boolean b = new Boolean(true);
        boolean b2 = Boolean.TRUE;
        boolean b3 = Boolean.getBoolean("false");
    }
}
