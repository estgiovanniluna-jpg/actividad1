package ejercicio2;

import ejercicio1.Ciudad;
import ejercicio1.pasajero;
import ejercicio1.tiquete;
import ejercicio1.vuelos;
import ejercicio2.cliente;
import ejercicio2.compra;
import ejercicio2.persona;
import ejercicio2.proveedor;
import ejercicio2.tipo_producto;

public class tiendaSeryus {

    private int id;
    private String nombres;

    // Constructor
    public tiendaSeryus(int id, String nombres) {
        this.id = id;
        this.nombres = nombres;
    }

    // Métodos GET
    public int getId() {
        return id;
    }

    public int getNombres() {
        return nombres;
    }

    public static void main(String[] args) {

        // Crear objetos de la clase producto
        producto producto1 = new producto(1, "sudadera $300.000");
        producto producto2 = new producto(2, "zapatillas $400.000");
        producto producto3 = new producto(3,"pantalonetas $100.000" );
        producto producto4 = new producto(4,"camisetas sport $150.000" );

        //Crear un objeto de la clase cliente 
        cliente cliente1 = new cliente(1, "Ciro gio Osorio de mora");
       

        //Crear un objeto de la clase compra 
        compra compra1 = new compra(1, 12022026, 0.19, 950000);
        

        tiquete tiquete1 = new tiquete(1, 20240601, vuelo1, pasajero2, 23);

        tiquete1.mostrarInfo();
    }

    
}
