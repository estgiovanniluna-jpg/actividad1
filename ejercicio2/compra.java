package ejercicio2;
import java.util.ArrayList;

public class compra {

    private int consecutivoCompra;
    private int fechaCompra;
    private cliente cliente;
    private ArrayList<producto> productos;
    private producto producto;
    private double valorTotalIva;
    private double totalCompra;


    // Constructor recibe el cliente directamente
    public compra(int consecutivoCompra, int fechaCompra, cliente cliente) {
        this.consecutivoCompra = consecutivoCompra;
        this.fechaCompra = fechaCompra;
        this.cliente = cliente;
        this.productos = new ArrayList<>();   // Lista vacía lista para agregar
        this.valorTotalIva = 0;
        this.totalCompra = 0;
    }

    // Calcular IVA según el tipo de cada producto
    public void calcularIva() {
        valorTotalIva = 0; 
        for (producto p : productos) {
            double ivaProducto = p.getPrecioVenta() * p.getTipoProducto().getPorcentajeIva();
            valorTotalIva = valorTotalIva + ivaProducto;
        }
    }

        // Agregar un producto a la compra
    public void agregarProducto(producto producto) {
        productos.add(producto);
    }

    // Calcular valor total sumando precios
    public void calcularTotal() {
        totalCompra = 0;
        for (producto p : productos) {
            totalCompra = totalCompra + p.getPrecioVenta();
        }
    }

    // Calcular valor a pagar = total + iva
    public void calculartotalCompra() {
        totalCompra = totalCompra + valorTotalIva;
    }

    // Mostrar resumen de la compra
    public void mostrarResumen() {
        System.out.println("\n--- Resumen de Compra ---");
        System.out.println("Compra No:     " + consecutivoCompra);
        System.out.println("Fecha:         " + fechaCompra);
        System.out.println("Cliente:       " + cliente.getNombre() + " (ID: " + cliente.getId() + ")");
        System.out.println("\nProductos comprados:");
        for (producto p : productos) {
            System.out.println("  - [" + p.getTipoProducto().getDescripcion() + "] " 
                            + p.getDescripcion() + " $" + p.getPrecioVenta());
        }
        System.out.println("Valor Total:   $" + totalCompra);
        System.out.println("IVA:           $" + valorTotalIva);
        System.out.println("Valor a Pagar: $" + totalCompra);
    }

    // Getters
    public int getConsecutivoCompra() { return consecutivoCompra; }
    public int getFechaCompra()       { return fechaCompra; }
    public cliente getCliente()       { return cliente; }
    public void setCliente(cliente cliente) { this.cliente = cliente; }
    public ArrayList<producto> getProductos() { return productos; }
    public double getValorTotal()     { return totalCompra; }
    public double getIva()            { return valorTotalIva; }
    public double gettotalCompra()    { return totalCompra; }

    public void setConsecutivoCompra(int consecutivoCompra) {
        this.consecutivoCompra = consecutivoCompra;
    }

    public void setFechaCompra(int fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public double  lorTotalIva() {
        return valorTotalIva;
    }

    public void setValorTotalIva(double valorTotalIva){
        this.valorTotalIva = valorTotalIva;
    }

    public double getTotalCompra() {
        return totalCompra;
    }

    public void setTotalCompra(int totalCompra) {
        this.totalCompra = totalCompra;
    }

    public  producto getProducto() {
        return producto; 
    }   


    public void setProducto( producto producto) {
        this.producto = producto;
    }

}