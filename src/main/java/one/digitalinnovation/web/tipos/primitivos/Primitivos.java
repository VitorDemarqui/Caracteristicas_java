package one.digitalinnovation.web.tipos.primitivos;

public class Primitivos {
    public static void main(String[] args){
        //Sao divididos pelos grupos



                        //INTEIROS



        //byte nullByre = null
        // - NUNCA PODE SER NULO OS TIPOS PRIMITIVOS
        // - POSSUEM VALOR DEFAUL

        byte b;         //8 bits
        byte b1 = 127;
        byte b2 = -128;
        //byte b3 = 129;    //to large

        char c;         //16 bits
        char c1 = 'A';
        char c2 = 15;
        //char c3 = 'AA';   //NOK apenas um caractere
        //char c4 = -100;  //NOK numero muito grande

        short s;   //16 bits
        short s1 = 32767;
        short s2 = -32767;

        int i = 2147483647;     //32 bits
        int i2 = -2147483648;
        //int i3 = -2147483649;     //to large

        long l = 9223372036854775807L; //COLOCAR L NO FINAL PARA INDICAR AO COMPILADOR
        long l1 = -9223372036854775808L;
        //long l2 = 9223372036854775808L; //to large


                            //FLUTUANTES


        float f = 65f;      //32 bits 3.402,823,5 E+32
        float f1 = 65.0f;
        float f2 = -0.5f;    //1.4 E-45

        double d = 1024.99; //64 bits 1.797,693,134,862,315,7 E+308
        double d2 = 10.2456; //4.9 E-324

        //Booleano

        boolean bo = true;
        boolean bo2 = false;
        //boolean bo3 = "false";     //NOK
        //boolean bo4 = 'false';    //NOK

        //void v; //palavra reservada para um tipo
        //System.out.println("byte : "+ b); //ERROR DEVE INICIALIZAR A VARIAVEL

    }
}
