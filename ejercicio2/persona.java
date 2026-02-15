package ejercicio2;

public class persona {

    protected int identificacion;
    protected String nombre;

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
