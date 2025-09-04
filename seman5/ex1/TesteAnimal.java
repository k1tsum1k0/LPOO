import java.util.ArrayList;

class Animal{
    private String nome;
    private int idade;

    // metodos
    public String getNome(){
        return nome;
    }
    public void setNome(String n){
        nome=n;
    }
    public int getIdade(){
        return idade;
    }
    public void setIdade(int i){
        idade=i;
    }
    public void emiteSom(){
        System.out.println("emite som!!");
    }

}

class Cachorro extends Animal{
    @Override
    public void emiteSom(){
        System.out.println("Woof, Woof!!");
    }
}

class Gato extends Animal{
    @Override
    public void emiteSom(){
        System.out.println("Miaw, Miaw!!");
    }
}

class Passaro extends Animal{
    @Override
    public void emiteSom(){
        System.out.println("Piu, Piu!!");
    }   
}

public class TesteAnimal{
    public static void main(String[] args) {
        ArrayList<Animal> animais = new ArrayList<>();
        // criando animais
        Animal bemtevi = new Passaro();
        bemtevi.setNome(n:"teste");
        bemtevi.setIdade(i:10);
        animais.add(bemtevi);

        for(Animal animal: animais){
            animal.emiteSom();
        }
    }


 

}


