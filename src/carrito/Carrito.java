package carrito;

import java.util.ArrayList;
import java.util.List;

import producto.Producto;

public class Carrito {
    private List<Producto> listaProductos;
    private double total;

    // Constructor
    public Carrito() {
        this.listaProductos = new ArrayList<>();
        this.total = 0;
    }

    //Getters
    public double getTotal() {
        return total;
    }

    // Methods
    public void agregarProducto(Producto producto) {
        this.listaProductos.add(producto);
        this.total += producto.getPrecio();
    }

    public void eliminarProducto(Producto producto) {
        this.listaProductos.remove(producto);
        this.total -= producto.getPrecio();
    }

    public void listarProductos() {
        System.out.println("Productos en el carrito:");
        for (Producto producto : this.listaProductos) {
            System.out.println("- " + producto.getNombre());
        }
    }


}
