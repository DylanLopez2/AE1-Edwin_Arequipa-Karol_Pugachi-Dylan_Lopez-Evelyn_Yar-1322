public class Main {
    public static void main(String[] args) {
        // Crear el modelo, la vista y el controlador
        Inventario modelo = new Inventario();
        InventarioView vista = new InventarioView();
        InventarioController controlador = new InventarioController(modelo, vista);

        // Agregar algunos productos
        controlador.agregarProducto("Laptop HP", 10, 1200.00);
        controlador.agregarProducto("Teléfono Redmi 13C", 20, 600.00);
        controlador.agregarProducto("Tablets Samsung", 15, 300.00);

        // Mostrar el inventario
        controlador.mostrarInventario();

        // Buscar un producto
        controlador.buscarProducto("Teléfono Redmi 13C");

        // Eliminar un producto
        controlador.eliminarProducto("Tablet Samsung");

        // Mostrar el inventario actualizado
        controlador.mostrarInventario();
    }
}



