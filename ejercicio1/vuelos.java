package ejercicio1;

public class vuelos {
    private String ciudadSalida, ciudadLlegada;
    private int numeroVuelo, duracionVuelo;

    // Constructor
    public vuelos(int numeroVuelo, String ciudadSalida, String ciudadLlegada, int duracionVuelo){
        this.numeroVuelo = numeroVuelo;
        this.ciudadSalida = ciudadSalida;
        this.ciudadLlegada = ciudadLlegada;
        this.duracionVuelo = duracionVuelo;
    }

    // Getters
    public String getCiudadSalida() {
        return ciudadSalida;
    }

    public String getCiudadLlegada() {
        return ciudadLlegada;
    }

    public int getNumeroVuelo() {
        return numeroVuelo;
    }

    public int getDuracionVuelo() {
        return duracionVuelo;
    }
}
