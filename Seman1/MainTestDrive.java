class Dog{
    int size;   // tamamho do Dog
    String breed; // raça do Dog
    String name; // nome do Dog

    // Métodos
    void bark(){
        System.out.println("Cachorro "+name+" está latindo!!");
        System.out.println("Ruff! Ruff!");
    }
 
}

// Classe que possui a main
public class MainTestDrive{
    public static void main(String[] args){
        // Criando novos objetos do tipo Dog
        Dog mel = new Dog();
        mel.name="Mel";
        mel.breed="Vira-lata";
        mel.size=5;
        mel.bark();

        Dog bibi = new Dog();
        bibi.bark();
        bibi.name="Bibi";
        bibi.breed="Pit Bull";
        bibi.size=30;
        bibi.bark();

    }

}