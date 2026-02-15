package ejercicio1;
import javax.swing.JOptionPane;

public class run {
    public static void main(String[] args) {

        // Crear objetos de la clase Ciudad
        Ciudad ciudad1 = new Ciudad(1, "Madrid");
        Ciudad ciudad2 = new Ciudad(2, "Barranquilla");

        // Crear un objeto de la clase vuelos
        vuelos vuelo1 = new vuelos(123, ciudad1.getNombre(), ciudad2.getNombre(), 120);

        JOptionPane.showMessageDialog(null, "Ciudad destino: " + ciudad1.getNombre() + "\nCiudad origen: " + ciudad2.getNombre());
    }
}
