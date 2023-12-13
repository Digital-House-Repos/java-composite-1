package producto;

import java.util.ArrayList;
import java.util.List;

public class Combo extends Producto {
    private List<Producto> listaProductos = new ArrayList<>();

    // Constructor
    public Combo(String nombre) {
        super(nombre, 0);
    }

    // Methods
    public void agregarProducto(Producto producto) {
        listaProductos.add(producto);
        this.calcularPrecioConDescuento();
    }

    public void quitarProducto(Producto producto) {
        listaProductos.remove(producto);
        this.calcularPrecioConDescuento();
    }

    public void calcularPrecioConDescuento() {
        double precio = 0;
        for (Producto producto : listaProductos) {
            precio += producto.getPrecio();
        }
        this.precio = precio * 0.9;
    }

    // to String
    @Override
    public String toString() {
        String str = "Combo: " + nombre + " - " + precio + "\n";
        for (Producto producto : listaProductos) {
            str += " * " + producto.toString() + "\n";
        }
        return str;
    }
}
