class Player{
    // atributos da classe
    int number;

    //metodos da classe
    void gress(){
        //calcula um numero de 1 a 9 e armazena na variavel number
        number=(int) (Math.random() * 10);
    
    }

}

class GuessGame{
    // declara 3 objetods da classe player
    Player p1= new Player();
    Player p2= new Player();
    Player p3=new Player();

    //declara as variaveis que iram armazenar os palpites dos jogadores
    int p1gress;
    int p2gress;
    int p3gress;

    //inicia as variaveis booleanas em false
    boolean p1IsRight=false;
    boolean p2IsRight=false;
    boolean p3IsRight=false;

    // faz o sorteio do numero a ser adivinhado
    int targetNumber = (int)(Math.random()*10);
    System.out.println("I'm Thinking in a number between  1 and 9...");






}

public class MainGameLauncher{
    public static void main(String[] args){

    }
}