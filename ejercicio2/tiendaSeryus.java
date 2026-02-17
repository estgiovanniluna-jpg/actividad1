package ejercicio2;

import java.util.ArrayList;

public class tiendaSeryus {
    private String nombre;
    private ArrayList<producto> productos;    // Lista de productos de la tienda
    private int id;

    // Constructor
    public tiendaSeryus(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.productos = new ArrayList<>();   // Inicializar lista vacíA
    }

    // Agregar producto a la tienda
    public void agregarProducto(producto producto) {
        productos.add(producto);
    }

    // Buscar producto por id en la lista
    public producto buscarProducto(int id) {
        for (producto p : productos) {
            if (p.getId() == id) {
                return p; // Lo encontró, lo retorna
            }
        }
        return null; // No lo encontró
    }

    // Mostrar lista de productos con su tipo
    public void listarProductos() {
        System.out.println("\n--- Lista de Productos de " + nombre + " ---");
        System.out.println("ID\tTipo\t\t\tDescripcion\t\tPrecio");
        System.out.println("-----------------------------------------------------------");
        for (producto p : productos) {
            System.out.println(p.getId() + "\t" 
                + p.getTipoProducto().getDescripcion() + "\t\t" 
                + p.getDescripcion() + "\t\t$" 
                + p.getPrecioVenta());
        }
    }
    public static void main(String[] args) {

        proveedor proveedor1 = new proveedor(1, "Geovanni Osorio de mora");

        tipo_producto tipoProducto1 = new tipo_producto(1, "sudadera", 0.19);
        tipo_producto tipoProducto2 = new tipo_producto(2, "zapatillas", 0.19);
        tipo_producto tipoProducto3 = new tipo_producto(3, "pantalonetas", 0.19);
        tipo_producto tipoProducto4 = new tipo_producto(4, "camisetas sport", 0.19);
        
        // Crear objetos de la clase producto
        producto producto1 = new producto(1, tipoProducto1, "TALLA L",  300000.00, 1, proveedor1);
        producto producto2 = new producto(2, tipoProducto2, "TALLA 42", 500000.00, 1, proveedor1);
        producto producto3 = new producto(3, tipoProducto3, "TALLA M", 200000.00, 1, proveedor1);
        producto producto4 = new producto(4, tipoProducto4, "TALLA S", 150000.00, 1, proveedor1);

                // ===== Crear tienda y asignar los 4 productos a la lista =====
        tiendaSeryus tienda = new tiendaSeryus(1, "Seryus Sport");
        tienda.agregarProducto(producto1);
        tienda.agregarProducto(producto2);
        tienda.agregarProducto(producto3);
        tienda.agregarProducto(producto4);

        //Crear un objeto de la clase cliente 
        cliente cliente1 = new cliente(1, "Arnolfino giova Osorio de mora");

        //Crear un objeto de la clase compra 
        compra compra1 = new compra(1, 12022026, cliente1);

        // ===== PASO 4: El cliente ya está asignado desde el constructor =====
        // compra1 ya tiene cliente1 desde que se creó arriba

        // ===== PASO 5: Buscar dos productos en la lista y asignarlos a la compra =====
        producto encontrado1 = tienda.buscarProducto(1);  // Busca sudadera
        producto encontrado2 = tienda.buscarProducto(3);  // Busca pantaloneta
        compra1.agregarProducto(encontrado1);
        compra1.agregarProducto(encontrado2);

        // Calcular valores
        compra1.calcularTotal();
        compra1.calcularIva();
        compra1.calculartotalCompra();

        // ===== PASO 6: Mostrar lista de productos con tipo =====
        tienda.listarProductos();

        // Mostrar resumen de la compra
        compra1.mostrarResumen();
    }
}
