package ejercicio2;

public class persona {

    private int identificacion;
    private String nombre;

    public persona(int identificacion, String nombre) {
        this.identificacion = identificacion;
        this.nombre = nombre;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public String getNombre() {
        return nombre;
    }
}
