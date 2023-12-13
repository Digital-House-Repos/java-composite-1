package producto;

public abstract class Producto {
    protected String nombre;
    protected double precio;

    // Constructor
    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    // to String
    @Override
    public String toString() {
        return "Producto: " + nombre + " - " + precio;
    }
}
