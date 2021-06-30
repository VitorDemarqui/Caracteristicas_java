package one.digitalinnovation.web.classes.cliente;

public class ProgramaDoCliente {
    public static void main (String[] args){
        final var cliente = new Cliente(12);

        cliente.getIdade();

        cliente.getPeso();

        //System.out.println(cliente.relatorio()); //nao consigo apesar da herança pois está em um pacote diferente
    }

}

