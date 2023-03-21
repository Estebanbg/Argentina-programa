import java.io.*;



public class Main {

    public static void main(String[] args) {
        String archivo = "C:\\Users\\esteb\\Escritorio\\Argentina Programa\\Ejercicios\\Todos los ejercicios resueltos\\Argentina-Programa-Java-inicial\\Ejercicio 3 archivos ultima version\\Ejercicio 3u.txt";
        String operacion = "";
        int desplazo = 0;


        Object[] resultado = leerArchivo(archivo);
        char[] caracteres = (char[]) resultado[0];
        operacion = (String) resultado[1];
        desplazo = (int) resultado[2];

        char[] nuevosCaracteres = OperacionPorRealizar(operacion, caracteres, desplazo);
        crearArchivo("salida.txt", nuevosCaracteres);
    }

    public static Object[] leerArchivo(String archivo) {
        char[] caracteres = new char[0];
        String operacion = "";
        int desplazo = 0;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(archivo));
            String texto = reader.readLine();
            operacion = reader.readLine();
            desplazo = Integer.parseInt(reader.readLine());
            caracteres = texto.toCharArray();
            reader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return new Object[] {caracteres, operacion, desplazo};
    }

    public static void crearArchivo(String nombreArchivo, char[] caracteres) {
        File archivo = new File(nombreArchivo);
        try {
            FileWriter escritor = new FileWriter(archivo);
            escritor.write(caracteres);
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
