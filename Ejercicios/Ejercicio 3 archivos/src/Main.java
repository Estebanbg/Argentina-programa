import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");
        char[] nuevosCaracteres ;
        System.out.println("ingrese el texto: ");
        String texto = sc.next();
        char[] caracteres = texto.toCharArray(); // Convierte la cadena en un arreglo de caracteres
        sc.next();
        System.out.println("ingrese la operacion que desea realizar: ");
        String operacion = sc.next();
        sc.close();


        nuevosCaracteres = OperacionPorRealizar(operacion, caracteres);

        System.out.println(Arrays.toString(nuevosCaracteres));
    }

    public static char[] OperacionPorRealizar (String operacion, char[] caracteres) {
        char[] nuevosCaracteres;

        if (operacion.equals("dec")) {
            nuevosCaracteres = decodificacion(caracteres);
        } else if (operacion.equals("cod")) {
            nuevosCaracteres = codificacion(caracteres);
        } else {
            nuevosCaracteres = new char[]{0};
            System.out.println("error");
        }

        return nuevosCaracteres;
    }

    public static char[] decodificacion(char[] caracteres) {
        char[] nuevosCaracteres = new char[caracteres.length];

        // Recorre el arreglo de caracteres y copia cada caracter en el nuevo arreglo
        for (int i = 0; i < caracteres.length; i++) {
            char c = caracteres[i];
            int representacion = (int) c + 1;
            char decodificacion = (char) representacion;
            nuevosCaracteres[i] = decodificacion; // Copia el caracter en el nuevo arreglo
        }

        return nuevosCaracteres;
    }

    public static char[] codificacion(char[] caracteres) {
        char[] nuevosCaracteres = new char[caracteres.length];

        // Recorre el arreglo de caracteres y copia cada caracter en el nuevo arreglo
        for (int i = 0; i < caracteres.length; i++) {
            char c = caracteres[i];
            int representacion = (int) c - 1;
            char decodificacion = (char) representacion;
            nuevosCaracteres[i] = decodificacion; // Copia el caracter en el nuevo arreglo
        }

        return nuevosCaracteres;
    }
}
