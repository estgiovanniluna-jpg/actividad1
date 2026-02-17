package ejercicio2;

public class tiendaSeryus {

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

        //Crear un objeto de la clase cliente 
        cliente cliente1 = new cliente(1, "Arnolfino giova Osorio de mora");
       

        //Crear un objeto de la clase compra 
        compra compra1 = new compra(1, 12022026, 0.19, 950000, producto3);
    }
}
