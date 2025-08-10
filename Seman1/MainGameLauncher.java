class Player{
    // atributos da classe
    int number;

    //metodos da classe
    public void guess(){
        //calcula um numero de 1 a 9 e armazena na variavel number
        number=(int)(Math.random() * 10);
    }

}

class GuessGame{

    // declara 3 objetods da classe player 
    Player p1 = new Player();
    Player p2 = new Player();
    Player p3 = new Player();

    public void startGame(){
    //declara as variaveis que iram armazenar os palpites dos jogadores
    int p1guess;
    int p2guess;
    int p3guess;

    //inicia as variaveis booleanas em false
    boolean p1IsRight=false;
    boolean p2IsRight=false;
    boolean p3IsRight=false;

    // faz o sorteio do numero a ser adivinhado
    int targetNumber;
    targetNumber = (int)(Math.random() * 10);
    System.out.println("I'm Thinking of a number between  0 and 9...");

    // enquanto ninguem adivinhar, continua executando as proximas linhas de codigo
    while(true){
        System.out.println("Number to guess "+targetNumber);
        p1.guess();
        p2.guess();
        p3.guess();

        p1guess=p1.number;
        System.out.println("Player one guessed "+p1guess);

        p2guess=p2.number;
        System.out.println("Player two guessed "+p1guess);

        p3guess=p3.number;
        System.out.println("Player Three guessed "+p3guess);

        if (p1guess == targetNumber){
            p1IsRight=true;
        }
        if(p2guess == targetNumber){
            p2IsRight=true;
        }
        if(p3guess == targetNumber){
            p3IsRight=true;
        } 
        if ( p1IsRight|| p2IsRight || p3IsRight){
            System.out.println("We have a winner");
            System.out.println("Player one got it right? "+p1IsRight);
            System.out.println("Player two got it right? "+p2IsRight);
            System.out.println("Player three got it right? "+p3IsRight);
            System.out.println("Game is over.");
            break;
        }else{
            System.out.println("Player will have to try again.");
        }
    }    
}
}
public class MainGameLauncher{
    public static void main(String[] args){
        GuessGame Partida1 = new GuessGame();
        Partida1.startGame();
    }
}