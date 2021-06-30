package one.digitalinnovation.web.finals;

public class CasualGamer extends Gamer{
    @Override
    public String keyboard(){
        return "Simple keyboard";
    }

    /*@Override
    public String mouse(){
        return super.mouse();
    }*/
    public  String play(final String game){
        //nao consigo alterar a variavel por ser final
        //game = "WOW";

        return "Jogando "+ game;
    }
}
