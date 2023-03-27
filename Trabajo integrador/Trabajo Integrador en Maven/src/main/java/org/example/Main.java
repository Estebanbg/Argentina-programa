import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class Main {

    public static void main(String[] args) {

        String equipoGanador1 = ".";
        String equipoGanador2 = ".";

        Partido partido1 = new Partido();
        Partido partido2 = new Partido();

        String pronEquipoGanador1 = ".";
        String pronEquipoGanador2 = ".";

        Pronostico pronPartido1 = new Pronostico();
        Pronostico pronPartido2 = new Pronostico();


        String [] resultado = leerResultados(partido1, partido2, equipoGanador1, equipoGanador2);



        System.out.println("\nResultado del primer partido: ");
        System.out.println(partido1.toString());
        if (resultado[0] .equals("Empate")){
            System.out.println("El partido termino en Empate "+ "\n \n \n ");
        }else{
            System.out.println("El equipo ganador es: ");
            System.out.println(resultado[0] + "\n \n \n ");
        }

        System.out.println("Resultado del segundo partido: ");
        System.out.println(partido2.toString());

        if (resultado[1] .equals("Empate")){
            System.out.println("El partido termino en Empate "+ "\n \n \n ");
        }else{
            System.out.println("El equipo ganador es: ");
            System.out.println(resultado[1] + "\n \n \n" );
        }






        String [] pronostico = leerPronostico(pronPartido1, pronPartido2, pronEquipoGanador1, pronEquipoGanador2);

        System.out.println("El pronostico de la persona 1 sobre primer partido: ");
        System.out.println(pronPartido1.toString());
        if (pronostico[0] .equals("Empate")){
            System.out.println("El pronostico fue un empate"+ "\n \n \n ");
        }else{
            System.out.println("Se pronostica como ganador a: ");
            System.out.println(pronostico[0] + "\n \n \n ");
        }

        System.out.println("El pronostico de la persona 1 sobre segundo partido: ");
        System.out.println(pronPartido2.toString());

        if (pronostico[1] .equals("Empate")){
            System.out.println("El pronostico fue un empate"+ "\n \n \n ");
        }else{
            System.out.println("Se pronostica como ganador a: "+ "\n \n \n ");
            System.out.println(pronostico[1] );
        }

        int puntosPersona = 0;


        if (pronostico[0] == resultado[0]){
            puntosPersona += 1;
        }
        if (pronostico[1] == resultado[1]){
            puntosPersona += 1;
        }
        System.out.println("La persona 1 sumo un total de " + puntosPersona + " puntos.");


    }

    public static String[] leerResultados(Partido partido1, Partido partido2, String equipoGanador1, String equipoGanador2) {


        String archivo = ("C:\\Users\\esteb\\Escritorio\\Argentina Programa\\Github\\Trabajo integrador\\v9 tp\\resultados.csv");

        BufferedReader br = null;

        String linea = "";
        String separador = ",";

        String[] resultado = new String[0];
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

            if (partido1.getGolesEquipo1() > partido1.getGolesEquipo2()) {
                equipoGanador1 = partido1.getEquipo1();
            } else if (partido1.getGolesEquipo1() < partido1.getGolesEquipo2()) {
                equipoGanador1 = partido1.getEquipo2();
            }else if (partido1.getGolesEquipo1() == partido1.getGolesEquipo2()){
                equipoGanador1 = "Empate";
            }


            if (partido2.getGolesEquipo1() > partido2.getGolesEquipo2()) {
                equipoGanador2 = partido2.getEquipo1();
            } else if (partido2.getGolesEquipo1() < partido2.getGolesEquipo2()) {
                equipoGanador2 = partido2.getEquipo2();
            } else if (partido2.getGolesEquipo1() == partido2.getGolesEquipo2()){
                equipoGanador2 = "Empate";
            }


            resultado = new String[]{equipoGanador1, equipoGanador2};


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

        return resultado;
    }

    public static String[] leerPronostico(Pronostico pronPartido1, Pronostico pronPartido2, String pronEquipoGanador1, String pronEquipoGanador2) {


        String archivo = ("C:\\Users\\esteb\\Escritorio\\Argentina Programa\\Github\\Trabajo integrador\\v9 tp\\pronostico.csv");

        BufferedReader br = null;

        String linea = "";
        String separador = ",";

        String[] pronostico = new String[0];

        try {
            br = new BufferedReader(new FileReader(archivo));

            // Lee el encabezado, pero es para descartarlo
            br.readLine();

            // Leemos la segunda linea y guardamos los datos en diferentes variables
            linea = br.readLine();

            String[] texto = linea.split(separador);

            pronPartido1.setEquipo1(texto[0]);
            pronPartido1.setganaEquipo1(texto[1]);
            pronPartido1.setganaEquipo2(texto[3]);
            pronPartido1.setEquipo2(texto[4]);

            linea = br.readLine();

            texto = linea.split(separador);

            pronPartido2.setEquipo1(texto[0]);
            pronPartido2.setganaEquipo1(texto[1]);
            pronPartido2.setganaEquipo2(texto[3]);
            pronPartido2.setEquipo2(texto[4]);

            if (pronPartido1.getganaEquipo1() .equals("X")) {
                pronEquipoGanador1 = pronPartido1.getEquipo1();
            } else if (pronPartido1.getganaEquipo2() .equals("X")) {
                pronEquipoGanador1 = pronPartido1.getEquipo2();
            }else if (pronPartido1.getganaEquipo1() == pronPartido1.getganaEquipo2()){
                pronEquipoGanador1 = "Empate";
            }


            if (pronPartido2.getganaEquipo1() .equals("X")) {
                pronEquipoGanador2 = pronPartido2.getEquipo1();
            } else if (pronPartido2.getganaEquipo2() .equals("X")) {
                pronEquipoGanador2 = pronPartido2.getEquipo2();
            }else if (pronPartido2.getganaEquipo1() == pronPartido2.getganaEquipo2()){
                pronEquipoGanador2 = "Empate";
            }


            pronostico = new String[]{pronEquipoGanador1, pronEquipoGanador2};


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

        return pronostico;
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
        return "Equipo de " + equipo1 + ": " +
                "" + golesEquipo1 + " goles \n" +
                "Equipo de " + equipo2 + ": " +
                "" + golesEquipo2 + " goles \n" ;

    }
}
class Pronostico {
    private String equipo1;
    private String ganaEquipo1;
    private String ganaEquipo2;
    private String equipo2;

    public Pronostico() {
        this.equipo1 = "";
        this.equipo2 = "";
        this.ganaEquipo1 = "";
        this.ganaEquipo2 = "";
    }

    public Pronostico(String equipo1, String equipo2, String ganaEquipo1, String ganaEquipo2) {
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
        this.ganaEquipo1 = ganaEquipo1;
        this.ganaEquipo2 = ganaEquipo2;
    }

    public String getEquipo1() {
        return equipo1;
    }

    public String getganaEquipo1() {
        return ganaEquipo1;
    }

    public String getganaEquipo2() {
        return ganaEquipo2;
    }

    public String getEquipo2() {
        return equipo2;
    }

    public void setEquipo1(String equipo1) {
        this.equipo1 = equipo1;
    }

    public void setganaEquipo1(String ganaEquipo1) {
        this.ganaEquipo1 = ganaEquipo1;
    }

    public void setganaEquipo2(String ganaEquipo2) {
        this.ganaEquipo2 = ganaEquipo2;
    }

    public void setEquipo2(String equipo2) {
        this.equipo2 = equipo2;
    }


    @Override
    public String toString() {
        return "Pronostico{" +
                "equipo1='" + equipo1 + '\'' +
                ", ganaEquipo1='" + ganaEquipo1 + '\'' +
                ", ganaEquipo2='" + ganaEquipo2 + '\'' +
                ", equipo2='" + equipo2 + '\'' +
                '}';
    }
}
