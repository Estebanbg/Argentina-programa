import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        char[] caracteres = {'H', 'o', 'l', 'a', ' ', 'm', 'u', 'n', 'd', 'o'};
        char[] nuevosCaracteres = new char[caracteres.length];


        // Recorre el arreglo de caracteres y copia cada caracter en el nuevo arreglo
        for (int i = 0; i < caracteres.length; i++) {
            char c = caracteres[i];
            int representacion = (int) c + 1;
            char decodificacion = (char) representacion;
            nuevosCaracteres[i] = decodificacion; // Copia el caracter en el nuevo arreglo
        }

        System.out.println(Arrays.toString(nuevosCaracteres));

    }
}