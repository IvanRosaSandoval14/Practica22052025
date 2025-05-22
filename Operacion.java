public class Operacion { 

    public int Sumar(int a, int b) {
        if(a<0 || b<0){
        System.out.println("No se puede realizar la suma");
        return -1;
    }  
        return a + b;

    }
    public double Sumar(double a, double b) {
        return a + b;
    }

    public long Sumar(long a, int b) {
        return a + b;
    }

    public void Sumar(){
        
    }
 public long Sumar(int a, long b) {
        return a + b;
    }

    public int Sumar(int a, int b, int c) {
        return a + b + c;
        
    }

    public int Sumar(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    public  void ImprimirNumeroImpares(int a){
        if (a%2==1){
            System.out.println("El número es impar" + a);
        
        }
       a--;
       if(a>0){
           ImprimirNumeroImpares(a);
       }
    }

}
