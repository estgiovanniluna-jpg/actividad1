package ejercicio1;

public class tiquete{

 
    private int numero;
    private int fechaCompra;
    private int numeroSilla;

  
    public tiquete( int numero, int fechaCompra, int numeroSilla) {
        
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
