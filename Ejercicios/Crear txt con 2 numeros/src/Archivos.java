

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Archivos {
    public static void main(String[] args) {
        String texto = "31 \n5";
        File archivo = new File("numeros.txt");

        FileWriter escritor = null;
        try {
            escritor = new FileWriter(archivo);
            escritor.write(texto);
            escritor.close();
            System.out.println("exito");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}