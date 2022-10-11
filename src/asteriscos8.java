import javax.swing.*;

public class asteriscos8 {
    public static void main(String[] args) {

        String base;
        base = JOptionPane.showInputDialog("Introduzca un numero para base de la pirámide");
        int n = Integer.parseInt(base);//pedir datos por teclado
        boolean b = n % 2 != 0;
        for (int i = 0; i < n; ++i) {

            System.out.println();//salto de linea

            for (int e = 0; e <i; ++e) {//espacios

                System.out.print(" ");
            }

            for (int a = 0; a < n - i; ++a) {//asteriscos

                System.out.print(" *");
            }
            System.out.print("");
        }
    }
}

