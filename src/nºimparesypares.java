import java.util.Scanner;
public class nºimparesypares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer a;
        Integer b;
        Integer c;
        System.out.print("Introduzca el primer número: ");
        a = sc.nextInt();
        System.out.print("Introduzca el segundo número: ");
        b = sc.nextInt();

        if (a > b) {//intercambiamos un numero por otro.
            c = b;
            b = a;
            a = c;
        }
        int diferencia  = a - b;//calculo la diferencia a-b
        int incremento=0;
        //si la diferencia es PAR, bucle hacia abajo de 2 en 2
        if (diferencia % 2 == 0) {
            incremento=-2;
        }else{ //si la diferencia es IMPAR, bucle hacia abajo de 1 en 1
            incremento=-1;
        }
        for (int i=b; i>=a; i+=incremento) {
            System.out.print(i+", ");
        }
        }
    }








