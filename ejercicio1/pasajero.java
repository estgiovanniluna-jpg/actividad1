package ejercicio1;

public class pasajero {
    private int id;
    private String nombre;
    private int edad;
    private String genero;

    public pasajero(int id, String nombre, int edad, String genero){
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }


    public int getEdad() {
        return edad;
    }


    public String getGenero() {
        return genero;
    }

    
}