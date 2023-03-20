import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class Main {

    public static void main(String[] args) {

        String archivo = ("C:\\Users\\esteb\\Escritorio\\Argentina Programa\\Trabajo practico\\v6 tp\\resultados.csv");
        Partido partido1 = new Partido();
        Partido partido2 = new Partido();


        leerArchivo(archivo, partido1, partido2);

        System.out.println(partido1.toString());
        System.out.println(partido2.toString());


    }

    public static void leerArchivo(String archivo, Partido partido1, Partido partido2) {

        BufferedReader br = null;

        String linea = "";
        String separador = ",";

        try {
            br = new BufferedReader(new FileReader(archivo));

            // Lee el encabezado, pero es para descartarlo
            br.readLine();

            // Leemos la segunda linea y guardamos los datos en diferentes variables
            linea = br.readLine();

            String[] texto = linea.split(separador);

            partido1.setEquipo1(texto[0]);
            partido1.setGolesEquipo1(Integer.parseInt(texto[1]));
            partido1.setGolesEquipo2(Integer.parseInt(texto[2]));
            partido1.setEquipo2(texto[3]);

            linea = br.readLine();

            texto = linea.split(separador);

            partido2.setEquipo1(texto[0]);
            partido2.setGolesEquipo1(Integer.parseInt(texto[1]));
            partido2.setGolesEquipo2(Integer.parseInt(texto[2]));
            partido2.setEquipo2(texto[3]);

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
    }

}

class Partido {
    private String equipo1;
    private int golesEquipo1;
    private int golesEquipo2;
    private String equipo2;

    public Partido() {
        this.equipo1 = "";
        this.equipo2 = "";
        this.golesEquipo1 = 0;
        this.golesEquipo2 = 0;
    }


    public Partido(String equipo1, String equipo2, int golesEquipo1, int golesEquipo2) {
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
        this.golesEquipo1 = golesEquipo1;
        this.golesEquipo2 = golesEquipo2;
    }

    public String getEquipo1() {
        return equipo1;
    }

    public int getGolesEquipo1() {
        return golesEquipo1;
    }

    public int getGolesEquipo2() {
        return golesEquipo2;
    }

    public String getEquipo2() {
        return equipo2;
    }

    public void setEquipo1(String equipo1) {
        this.equipo1 = equipo1;
    }

    public void setGolesEquipo1(int golesEquipo1) {
        this.golesEquipo1 = golesEquipo1;
    }

    public void setGolesEquipo2(int golesEquipo2) {
        this.golesEquipo2 = golesEquipo2;
    }

    public void setEquipo2(String equipo2) {
        this.equipo2 = equipo2;
    }


    public String toString() {
        return "Equipo 1: " + equipo1 + "\n" +
                "Goles Equipo 1: " + golesEquipo1 + "\n" +
                "Goles Equipo 2: " + golesEquipo2 + "\n" +
                "Equipo 2: " + equipo2 + "\n";
    }
}
