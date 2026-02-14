package ejercicio1;

public class Ciudad {

    private int id;
    private String nombre;

    public Ciudad(int Id, String Nombre){
        this.id = Id;
        this.nombre = Nombre;
    }

    public int getId(){
        return id;
    }

    public String getNombre(){
        return nombre;
    }
}