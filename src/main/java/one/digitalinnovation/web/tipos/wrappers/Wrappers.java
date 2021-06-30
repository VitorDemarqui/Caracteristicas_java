package one.digitalinnovation.web.tipos.wrappers;

public class Wrappers {
    public static void main(String[] args) {
        //Autoboxing - consigo atribuir valores nulos
        //compilador sabe que tem que auto construir o objet

        Byte b;         //8 bits //byte
        Byte b1 = 127;
        Byte b2 = -128;
        Byte nullByte = null;


        Character c;         //16 bit char
        Character c1 = 'A';
        Character c2 = 15;


        Short s;   //16 bits short
        Short s1 = 32767;
        Short s2 = -32767;

        Integer i = 2147483647;     //32 bits int
        Integer i2 = -2147483648;

        Long l = 9223372036854775807L; //long
        Long l1 = -9223372036854775808L;

        //FLUTUANTES


        Float f = 65f;      //32 bits 3.402,823,5 E+32  float
        Float f1 = 65.0f;
        Float f2 = -0.5f;    //1.4 E-45

        Double d = 1024.99; //64 bits 1.797,693,134,862,315,7 E+308     double
        Double d2 = 10.2456; //4.9 E-324

        //Booleano

        Boolean bo = true;      //boolean
        Boolean bo2 = false;

        //chamando métodos
        Boolean bo3 = Boolean.getBoolean("false");//OK
        Boolean bo4 = Boolean.valueOf("true");//OK
    }
}
