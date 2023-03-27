package Pruebas;

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