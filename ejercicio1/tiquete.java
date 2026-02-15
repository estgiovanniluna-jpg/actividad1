package ejercicio1;

public class tiquete{

 
    private int numero;
    private int fechaCompra;
    private vuelos vuelo;
    private pasajero pasajero;
    private int numeroSilla;


  
    public tiquete( int numero, int fechaCompra, vuelos vuelo, pasajero pasajero,int numeroSilla) {
        
        this.numero = numero;
        this.fechaCompra = fechaCompra;
        this.vuelo = vuelo;
        this.pasajero = pasajero;
        this.numeroSilla = numeroSilla;
    }   

    public int getNumero() {
        return numero;
    }

    public int getFechaCompra() {
        return fechaCompra;
    }   

    public int getnumeroSilla() {
        return numeroSilla;
    }

    // Método para mostrar información completa
    public void mostrarInfo() {
        System.out.println("=== INFORMACIÓN DEL TIQUETE ===");
        System.out.println("Tiquete No: " + numero);
        System.out.println("Fecha: " + fechaCompra);
        System.out.println("\nVuelo No: " + vuelo.getNumeroVuelo());
        System.out.println("Ciudad Destino: " + vuelo.getCiudadLlegada().getNombre());
        System.out.println("Hora Salida: " + vuelo.getHoraSalida());
        System.out.println("\nPasajero: " + pasajero.getNombre());
        System.out.println("ID: " + pasajero.getIdentificacion());
        System.out.println("Silla: " + numeroSilla);
    }
}
