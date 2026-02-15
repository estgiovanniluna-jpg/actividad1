package ejercicio1;
import javax.swing.JOptionPane;
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
        JOptionPane.showMessageDialog(null, 
            "=== INFORMACIÓN DEL TIQUETE ===\n" +
            "Tiquete No: " + numero + "\n" +
            "Fecha: " + fechaCompra + "\n\n" +
            "Vuelo No: " + vuelo.getNumeroVuelo() + "\n" +
            "Ciudad Destino: " + vuelo.getCiudadLlegada().getNombre() + "\n" +
            "Hora Salida: " + vuelo.getHoraSalida() + "\n\n" +
            "Pasajero: " + pasajero.getNombre() + "\n" +
            "CC: " + pasajero.getIdentificacion() + "\n" +
            "Silla: " + numeroSilla);
            }

}
