public class Main {
    public static void main(String[] args) {
        int a = 3, b = 5;
        int resultado = suma(a, b);
        System.out.println("La suma de " + a + " y " + b + " es: " + resultado);
    }

    public static int suma(int num1, int num2) {
        int suma = num1 + num2;
        return suma;
    }
}