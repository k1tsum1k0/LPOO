class Movie{
    // atributos da classe
    String titulo;
    String genero;
    String classificacao;
    
    // metodo da classe
    void playit(){
        System.out.println("O filme "+titulo+" está sendo reproduzido");
    }


}
public class MainMovie{
    public static void main(String[] args){
        
        // novo objeto
        Movie comotreinarseudragao = new Movie();

        comotreinarseudragao.titulo="Como Treinar Seu Dragão";
        comotreinarseudragao.genero="Animação";
        comotreinarseudragao.classificacao="Todas as idades";

        comotreinarseudragao.playit();


    }
}