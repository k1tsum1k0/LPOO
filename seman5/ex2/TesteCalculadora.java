class Calculadora{
public int somar(int a,int b){
    return a+b;
}
public double somar(double a,double b){
    return a+b;
}
public int somar(int a,int b,int c){
    return a+b+c;
}
public String somar(String a,String b){
    return a+b;
}
}
public class TesteCalculadora {
    public static void main(String[] args){
        Calculadora t = new Calculadora();
        System.out.println(t.somar(a:10, b:2,c:7));
        System.out.println(t.somar(a:"ana", b:"banana"));

    }
}
