import java.util.Scanner;

public class asteriscos12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero; ");//pedir nº por pantalla
        int num = sc.nextInt();
        int x;
        for (x = 0; x < num; ++x) {//piramide normal

            System.out.println();//salto de linea para colocar los asteriscos en filas

            for (int e = 0; e < num - x; ++e) {//espacios a la izquierda del asterisco

                System.out.print(" ");
            }

            for (int a = 0; a < x + 1; ++a) {//asteriscos

                System.out.print(" *");//para que salga centrada la piramide se pone un espacio antes del asterisco
            }

        }
        for (x = 0; x < num; ++x) { //piramide invertida
            System.out.println();//salto de linea para colocar los asteriscos en filas

            for (int e = 0; e < (x + 2); ++e) {//espacios a la izquierda del asterisco. se pone dos para que la base no se duplique

                System.out.print(" ");
            }

            for (int a = 0; a <num -(x + 1); ++a) {//asteriscos. se realiza num-(x+1) para que la piramide salga invertida

                System.out.print(" *");//para que salga centrada la piramide se pone un espacio antes del asterisco
            }

        }
    }}

