package ejercicio1;

public class datos_tiquetes {

 
    private int numero;
    private int fechaCompra;
    private int numeroSilla;

  
    public datos_tiquetes( int numero, int fechaCompra, int numeroSilla) {
        
        this.numero = numero;
        this.fechaCompra = fechaCompra;
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
}
