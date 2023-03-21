import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        String archivo = ("C:\\Users\\esteb\\Escritorio\\Argentina Programa\\Trabajo practico\\v6 tp\\resultados.csv");
        String[] texto = leerArchivo(archivo);


        String equipo1 = texto [0];
        String golesEquipo1 = texto [1];
        String golesEquipo2 = texto [2];
        String equipo2 = texto [3];
        String equipo3 = texto [4];
        String golesEquipo3 = texto [5];
        String golesEquipo4 = texto [6];
        String equipo4 = texto [7];



        System.out.println(equipo1 + " " + golesEquipo1 + "  " + golesEquipo2 + " " + equipo2);
        System.out.println(equipo3 + " " + golesEquipo3 + "  " + golesEquipo4 + " " + equipo4);

    }

    public static String[] leerArchivo(String archivo) {

        BufferedReader br = null;

        String linea = "";
        String separador = ",";


        String equipo1 = "";
        String equipo2 = "";
        String golesEquipo1 = "";
        String golesEquipo2 = "";
        String equipo3 = "";
        String equipo4 = "";
        String golesEquipo3 = "";
        String golesEquipo4 = "";

        try {
            br = new BufferedReader(new FileReader(archivo));

            // Lee el encabezado, pero es para descartarlo
            br.readLine();

            // Leemos la segunda linea y guardamos los datos en diferentes variables
            linea = br.readLine();

            String[] texto = linea.split(separador);

            equipo1 = texto [0];
            equipo2 = texto [3];

            golesEquipo1 = texto [1];
            golesEquipo2 = texto [2];

            // Leemos la tercera linea

            linea = br.readLine();

            texto = linea.split(separador);

            equipo3 = texto [0];
            equipo4 = texto [3];

            golesEquipo3 = texto [1];
            golesEquipo4 = texto [2];

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


        return new String[] {equipo1, golesEquipo1, golesEquipo2, equipo2, equipo3, golesEquipo3, golesEquipo4, equipo4};
    }
}
