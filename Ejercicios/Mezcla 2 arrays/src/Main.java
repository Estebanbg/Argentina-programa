public class Main {
    public static void main(String[] args) {
        int[] arrayDeNumeros = {12, 14, 13, 36, 15};
        String[] arrayDeNombres = {"Juan", "Juana", "Pedro", "Pedra", "Luis"};
        String[] arrayDeNombresyNumeros = new String[10];
// Crear un nuevo array con la longitud total de los dos arrays originales
        int j = 0;

// Recorrer los dos arrays simultáneamente, agregando cada elemento en un patrón intercalado
        for (int i = 0; i < arrayDeNombresyNumeros.length; i += 2) {
            arrayDeNombresyNumeros[i] = String.valueOf(arrayDeNumeros[j]);
            arrayDeNombresyNumeros[i + 1] = arrayDeNombres[j];
            j++;
        }
        for (int i = 0; i < arrayDeNombresyNumeros.length; i++) {
            System.out.println(arrayDeNombresyNumeros[i]);
        }

    }
}