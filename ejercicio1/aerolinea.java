package ejercicio1;

public class aerolinea {
    
    private int id;
    private int vuelos;

    // Constructor
    public aerolinea(int id, int vuelos) {
        this.id = id;
        this.vuelos = vuelos;
    }

    // Métodos GET
    public int getId() {
        return id;
    }

    public int getVuelos() {
        return vuelos;
    }
}