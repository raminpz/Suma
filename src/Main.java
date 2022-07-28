public class Main {
    public static void main(String[] args) {


        System.out.println("Suma de tres numero = " + suma(10,10,10));
        System.out.println("Coche de  = " + coche(3) + " puertas");

    }

    public static  int suma(int num1, int num2, int num3){
        return num1 + num2 + num3;
    }

    public  static int coche (int numPuertas){
        return numPuertas + 1;
    }
}
