import java.util.Scanner;

public class asteriscos10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero; ");
        int altura = sc.nextInt();
        for (int i = 0; i < altura; i++) {

            for (int a = 0; a < altura; a++) {//asteriscos
                System.out.print("*");
            }
            System.out.println("");

            for (int l = 0; l < altura; l++) {//lineas
                System.out.print("-");
            }
            System.out.println("");


        }
    }}