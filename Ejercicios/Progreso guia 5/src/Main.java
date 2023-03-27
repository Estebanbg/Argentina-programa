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

class Producto {
    private String nombre;
    private double precio;


    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}
class ItemCarrito {
    private Producto producto;
    private int cantidad;

    public ItemCarrito(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public int getCantidad() {
        return cantidad;
    }
}
class Descuento {
    private double descuentoFijo;
    private double descuentoPorcentaje;

    public Descuento(double descuentoFijo, double descuentoPorcentaje) {
        this.descuentoFijo = descuentoFijo;
        this.descuentoPorcentaje = descuentoPorcentaje;
    }


    public double getDescuentoFijo() {
        return descuentoFijo;
    }

    public double getDescuentoPorcentaje() {
        return descuentoPorcentaje;
    }

    public void setDescuentoFijo(double descuentoFijo) {
        this.descuentoFijo = descuentoFijo;
    }

    public void setDescuentoPorcentaje(double descuentoPorcentaje) {
        this.descuentoPorcentaje = descuentoPorcentaje;
    }
}

class Carrito {
    private ItemCarrito[] items;
    private int numItems;
    private Descuento descuento;

    public Carrito() {
        items = new ItemCarrito[10];
        numItems = 0;
        descuento = null;
    }

    public void agregarItem(Producto producto, int cantidad) {
        ItemCarrito item = new ItemCarrito(producto, cantidad);
        addItem(item);
    }

    public void addItem(ItemCarrito item) {
        if (numItems < items.length) {
            items[numItems] = item;
            numItems++;
        }
    }

    public void aplicarDescuentoFijo(double descuento) {
        this.descuento = new Descuento(descuento, 0);
    }

    public void aplicarDescuentoPorcentaje(double descuento) {
        this.descuento = new Descuento(0, descuento);
    }

    public double calcularTotal() {
        double subtotal = 0;
        for (int i = 0; i < numItems; i++) {
            ItemCarrito item = items[i];
            subtotal += item.getProducto().getPrecio() * item.getCantidad();
        }

        double total = subtotal;
        if (descuento != null) {
            if (descuento.getDescuentoFijo() > 0) {
                total -= descuento.getDescuentoFijo();
            } else if (descuento.getDescuentoPorcentaje() > 0) {
                total *= 1 - (descuento.getDescuentoPorcentaje() / 100);
            }
        }

        return total;
    }
}


