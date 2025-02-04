import java.util.List;

public class InventarioView {
    public void mostrarProducto(Producto producto) {
        if (producto != null) {
            System.out.println(producto.toString());
        } else {
            System.out.println("Producto no encontrado.");
        }
    }

    public void mostrarInventario(List<Producto> productos) {
        System.out.println("Inventario de la tienda:");
        for (Producto p : productos) {
            System.out.println(p.toString());
        }
    }
}
