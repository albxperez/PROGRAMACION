import java.util.Scanner;

public class asteriscos13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero de los lados del cuadrado; ");//pedir nº por pantalla
        int num = sc.nextInt();
        int x;
        //PIRAMIDE ARRIBA
        for (x = 0; x < num-1; ++x) {//piramide normal
            System.out.println();//salto de linea para colocar los asteriscos en filas
            for (int e = 0; e < num - (1+x); ++e) {//espacios a la izquierda del asterisco
                System.out.print(" ");
            }
            for (int a = 0; a < x + 1; ++a) {//asteriscos
                System.out.print(" *");//para que salga centrada la piramide se pone un espacio antes del asterisco
            }

        }

        //CUADRADO DE ESPACIOS
        for (int col = 1; col <= num; col++) {//numero de columnas
            System.out.println();//salto de linea
            for (int cont = 1; cont <= num; cont++) {//numero de repeticiones
                System.out.print(" *");
            }

        }
        //PIRÁMIDE ABAJO
        for (x = 0; x < num-1; ++x) { //piramide invertida
            System.out.println();//salto de linea para colocar los asteriscos en filas
            for (int e = 0; e < (x + 1); ++e) {//espacios a la izquierda del asterisco. se pone dos para que la base no se duplique
                System.out.print(" ");
            }
            for (int a = 0; a <num -(x + 1); ++a) {//asteriscos. se realiza num-(x+1) para que la piramide salga invertida
                System.out.print(" *");//para que salga centrada la piramide se pone un espacio antes del asterisco
            }
        }


        //PIRAMIDE LATERAL

    }}