import javax.swing.JOptionPane;
public class ejerciciosvarios {

    public static void main(String[] args) {

        //Declaramos una constante
         double IVA=0.21;

        String texto=JOptionPane.showInputDialog("Introduce el precio de un producto");
        //Pasamos el String a double
        double precio=Double.parseDouble(texto);

        //Obtenemos el precio final (precio+(precio*IVA))
        double precioFinal=precio+(precio*IVA);

        System.out.println(precioFinal);
    }
}
