import java.util.Scanner;

public class asteriscos11{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero; ");
        int altura =sc.nextInt();
        for (int i = 0; i < altura; i++) {
            for (int e = 0; e < i; e++) {//espacios
                System.out.print(" ");
            }

            for (int a = 0; a < altura; a++) { //asteriscos
                System.out.print("*");
            }
            System.out.println("");
        }

        for (int i = 0; i < altura; i++) {
            for (int e = 0; e < altura-i-2; e++) {//espacios
                System.out.print(" ");
            }

            for (int a = 0; a < altura; a++) { //asteriscos
                System.out.print("*");

        }
            System.out.println("");
        }
    }}



