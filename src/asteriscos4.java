import javax.swing.*;

public class asteriscos4 {
    public static void main(String[] args) {
        String filas;
        filas = JOptionPane.showInputDialog("Introduzca un numero de filas");//pide numero de filas
        int f = Integer.parseInt(filas);//convertidor datos en variables
        String columnas;
        columnas = JOptionPane.showInputDialog("Introduzca un numero de columnas");//pide numero de columnas
        int c = Integer.parseInt(columnas);//convertidor datos en variables

        for (int cont = 1; cont <= f; cont++) {//numero de filas
            System.out.println();//salto de linea
        for (int conta = 1; conta <= c; conta++) {//numero de columnas
             System.out.print("*");
            }
        }
    }
}