public class InventarioController {
    private Inventario modelo;
    private InventarioView vista;

    public InventarioController(Inventario modelo, InventarioView vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public void agregarProducto(String nombre, int cantidad, double precio) {
        Producto producto = new Producto(nombre, cantidad, precio);
        modelo.agregarProducto(producto);
    }

    public void mostrarInventario() {
        vista.mostrarInventario(modelo.obtenerProductos());
    }

    public void buscarProducto(String nombre) {
        Producto producto = modelo.buscarProducto(nombre);
        vista.mostrarProducto(producto);
    }

    public void eliminarProducto(String nombre) {
        modelo.eliminarProducto(nombre);
    }
}
