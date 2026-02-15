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
        JOptionPane.showMessageDialog(null,"=== INFORMACIÓN DEL TIQUETE ===");
        JOptionPane.showMessageDialog(null,"Tiquete No: " + numero);
        JOptionPane.showMessageDialog(null,"Fecha: " + fechaCompra);
        JOptionPane.showMessageDialog(null,"\nVuelo No: " + vuelo.getNumeroVuelo());
        JOptionPane.showMessageDialog(null,"Ciudad Destino: " + vuelo.getCiudadLlegada().getNombre());
        JOptionPane.showMessageDialog(null,"Hora Salida: " + vuelo.getHoraSalida());
        JOptionPane.showMessageDialog(null,"\nPasajero: " + pasajero.getNombre());
        JOptionPane.showMessageDialog(null,"CC: " + pasajero.getIdentificacion());
        JOptionPane.showMessageDialog(null,"Silla: " + numeroSilla);
    }
}
