import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        BufferedReader reader;

        try {
            String archivo = "C:\\Users\\esteb\\Escritorio\\Argentina Programa\\Trabajo practico\\Version 3 tp\\numeros2.txt" ;

            reader = new BufferedReader(new FileReader(archivo));
            String line = reader.readLine();
            int a = Integer.parseInt(line);
            int b = 0;
            String c ;
            int resultado = 0;


            System.out.println(a);

            line = reader.readLine();
            b = Integer.parseInt(line);
            System.out.println(b);

            line = reader.readLine();
            c = line;
            System.out.println(c);

            if (c .equals ("m")){
                resultado = a * b;
            }


            reader.close();

            System.out.println(resultado);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}