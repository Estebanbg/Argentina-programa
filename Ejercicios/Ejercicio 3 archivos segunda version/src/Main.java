import java.io.*;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        BufferedReader reader;

        char[] caracteres = new char[0];
        String operacion = "";
        int desplazo = 0;
        String texto = "";


        try {
            String archivo = "C:\\Users\\esteb\\Escritorio\\Argentina Programa\\Ejercicios\\Todos los ejercicios resueltos\\Argentina-Programa-Java-inicial\\Ejercicio 3 archivos segunda version\\Ejercicio 3.txt";

            reader = new BufferedReader(new FileReader(archivo));

            Scanner sc = new Scanner(archivo);

            texto = reader.readLine();

            caracteres = texto.toCharArray(); // Convierte la cadena en un arreglo de caracteres


            operacion = reader.readLine();


            desplazo = Integer.parseInt(reader.readLine());

            sc.close();

        } catch (IOException e) {
            e.printStackTrace();
        }




        char[] nuevosCaracteres  = OperacionPorRealizar(operacion, caracteres, desplazo);

        File archivotxt = new File("salida.txt");

        FileWriter escritor = null;
        try {
            escritor = new FileWriter(archivotxt);
            escritor.write(Arrays.toString(nuevosCaracteres));
            escritor.close();
            System.out.println("exito");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }



    public static char[] OperacionPorRealizar (String operacion, char[] caracteres, int desplazo) {
        char[] nuevosCaracteres;

        if (operacion.equals("decodificacion")) {
            nuevosCaracteres = decodificacion(caracteres, desplazo);
        } else if (operacion.equals("codificacion")) {
            nuevosCaracteres = codificacion(caracteres, desplazo);
        } else {
            nuevosCaracteres = new char[]{0};
            System.out.println("error");
        }

        return nuevosCaracteres;
    }

    public static char[] decodificacion(char[] caracteres, int desplazo) {
        char[] nuevosCaracteres = new char[caracteres.length];

        // Recorre el arreglo de caracteres y copia cada caracter en el nuevo arreglo
        for (int i = 0; i < caracteres.length; i++) {
            char c = caracteres[i];
            int representacion = (int) c - desplazo;
            char decodificacion = (char) representacion;
            nuevosCaracteres[i] = decodificacion; // Copia el caracter en el nuevo arreglo
        }

        return nuevosCaracteres;
    }

    public static char[] codificacion(char[] caracteres, int desplazo) {
        char[] nuevosCaracteres = new char[caracteres.length];

        // Recorre el arreglo de caracteres y copia cada caracter en el nuevo arreglo
        for (int i = 0; i < caracteres.length; i++) {
            char c = caracteres[i];
            int representacion = (int) c + desplazo;
            char decodificacion = (char) representacion;
            nuevosCaracteres[i] = decodificacion; // Copia el caracter en el nuevo arreglo
        }

        return nuevosCaracteres;
    }
}
