
/*
Implemente usted mismo el ejemplo visto en clase de “carrito de compras”: una clase
        Producto (que pueda tener hasta 3 items), otra ItemCarrito, otra Carrito y otra
        Descuento, con 2 subclases.
*/

public class CarritoDeCompras {

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

    public int getPrecio() {
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

    public double getPrecioTotal() {
        return producto.getPrecio() * cantidad;
    }
}

public class Carrito {
    private ItemCarrito[] items;
    private int numItems;

    public Carrito() {
        items = new ItemCarrito[10]; // Capacidad inicial de 10 elementos
        numItems = 0;
    }

    public void addItem(ItemCarrito item) {
        if (numItems < items.length) {
            items[numItems] = item;
            numItems++;
        }
    }

    public double getPrecioTotal() {
        double precioTotal = 0;
        for (int i = 0; i < numItems; i++) {
            precioTotal += items[i].getPrecioTotal();
        }
        return precioTotal;
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

