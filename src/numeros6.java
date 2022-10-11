

import java.util.Scanner;

public class numeros6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer a;
        Integer b;
        Integer c;
        System.out.print("Introduzca el primer número: ");
        a = sc.nextInt();
        System.out.print("Introduzca el segundo número: ");
        b = sc.nextInt();
        System.out.print("Introduzca el segundo número: ");
        c = sc.nextInt();


        if (a > b) {//definir el menor
            int aux = a;
            a = b;
            b = aux;
        }
        if (b > c) {
            int aux = b;
            b = c;
            c = aux;
        }
        if (a > b) {
            int aux = a;
            a = b;
            b = aux;
        }

        for (int i = b; i <= c; i += a) {
            System.out.println(i + ",");
        }
    }
}


