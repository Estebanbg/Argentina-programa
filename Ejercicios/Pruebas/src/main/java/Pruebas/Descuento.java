package Pruebas;

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

