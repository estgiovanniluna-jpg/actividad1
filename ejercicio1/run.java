package ejercicio1;
import javax.swing.JOptionPane;

public class run {
    public static void main(String[] args) {
        Ciudad ciudad1 = new Ciudad(1, "Madrid");
        Ciudad ciudad2 = new Ciudad(2, "Barranquilla");

        JOptionPane.showMessageDialog(null, "Ciudad destino: " + ciudad1.getNombre() + "\nCiudad origen: " + ciudad2.getNombre());
    }
}
