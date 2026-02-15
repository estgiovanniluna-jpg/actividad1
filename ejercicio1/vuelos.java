package ejercicio1;

public class vuelos {
    private Ciudad ciudadSalida, ciudadLlegada;
    private int numeroVuelo, duracionVuelo, horaSalida;

    // Constructor
    public vuelos(int numeroVuelo, Ciudad ciudadSalida, Ciudad ciudadLlegada, int horaSalida,int duracionVuelo){
        this.numeroVuelo = numeroVuelo;
        this.ciudadSalida = ciudadSalida;
        this.horaSalida = horaSalida;
        this.ciudadLlegada = ciudadLlegada;
        this.duracionVuelo = duracionVuelo;
    }

    // Getters
    public Ciudad getCiudadSalida() {
        return ciudadSalida;
    }

    public Ciudad getCiudadLlegada() {
        return ciudadLlegada;
    }

    public int getHoraSalida() {
        return horaSalida;
    }

    public int getNumeroVuelo() {
        return numeroVuelo;
    }

    public int getDuracionVuelo() {
        return duracionVuelo;
    }
}
