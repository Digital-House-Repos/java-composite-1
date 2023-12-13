import carrito.Carrito;
import producto.Acompanamiento;
import producto.Combo;
import producto.Producto;
import producto.Sandwich;

public class Main {
    public static void main(String[] args) {
        Producto producto1 = new Acompanamiento("Papas fritas", 10);
        Producto producto2 = new Sandwich("Sandwich de jamon y queso", 5);

        Combo combo1 = new Combo("Combo 1");
        combo1.agregarProducto(producto1);
        combo1.agregarProducto(producto2);

        Carrito carrito = new Carrito();

        // Productos individuales
        carrito.agregarProducto(producto1);
        carrito.agregarProducto(producto2);

        // Combo
        carrito.agregarProducto(combo1);
        System.out.println(combo1);

        carrito.listarProductos();
        System.out.println("Total del carrito: " + carrito.getTotal());
    }
}
