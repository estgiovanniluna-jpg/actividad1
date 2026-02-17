package ejercicio2;

public class cliente extends persona {

    public cliente (int identificacion, String nombre) {
        super(identificacion,nombre);
    }
    
    public String getNombre () {
        return nombre;
    }

    public int getId () {
        return identificacion;
    } 
}