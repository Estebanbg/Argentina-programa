package Pruebas;


import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Carrito carrito = new Carrito();

        try {
            File file = new File("compras.csv");
            Scanner scanner = new Scanner(file);

            int lineNumber = 0;
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();

                if (lineNumber > 0) {
                    String[] values = line.split(",");
                    String nombre = values[2];
                    double precio = Double.parseDouble(values[1]);
                    int cantidad = Integer.parseInt(values[0]);

                    carrito.agregarItem(new Producto(nombre, precio), cantidad);
                }

                lineNumber++;
            }

            scanner.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        carrito.aplicarDescuentoPorcentaje(20);
        double total = carrito.calcularTotal();
        System.out.println("Total: " + total);
    }

}