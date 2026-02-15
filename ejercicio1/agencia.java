package ejercicio1;

public class agencia {
    
    private int id;
    private int vuelos;

    // Constructor
    public agencia(int id, int vuelos) {
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

    public static void main(String[] args) {

        // Crear objetos de la clase Ciudad
        Ciudad ciudad1 = new Ciudad(1, "Madrid");
        Ciudad ciudad2 = new Ciudad(2, "Barranquilla");

        // Crear un objeto de la clase vuelos
        vuelos vuelo1 = new vuelos(123, ciudad1, ciudad2, 62, 120);

        //Crear un objeto de la clase pasajero
        pasajero pasajero1 = new pasajero(1, "Ciro Muñoz", 33, "Masculino");
        pasajero pasajero2 = new pasajero(2, "Giovanni Luna", 28, "Femenino");
        pasajero pasajero3 = new pasajero(3, "Natalia Osorio", 4, "Masculino");

        tiquete tiquete1 = new tiquete(1, 20240601, vuelo1, pasajero1, 23);

        tiquete1.mostrarInfo();
    }
}