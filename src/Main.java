public class Main {
    public static void main(String[] args) {

        coche coche1 = new coche(0);
        coche1.AñadirPuerta();
        coche1.AñadirPuerta();

        System.out.println("NumeroPuertas = " + coche1.numeroPuertas);

        int resultado = suma(5,1,4);
        System.out.println("resultado = " + resultado);
    }

    public static int suma(int a, int b, int c){
        return (a + b + c);
    }
}