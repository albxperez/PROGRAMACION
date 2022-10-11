import java.util.Scanner;

public class Numeros {

    public static void main(String[] args) {
    {
        Scanner sc= new Scanner(System.in);
        int n = 1;
        int x = 100;
        int y = 1;
        System.out.println("Los numeros multiplos de 2 son: ");
        for(n=1; n<=100; n++) {
            if (n % 2 == 0) {
        System.out.print(n + " ");
            }
        }

        System.out.println("");
        System.out.println("Los numeros multiplos de 3 son: ");
        for(y=1; y<=100; y++){
            if (y % 3 == 0) {
        System.out.print(y + " ");
            }
            }


    }


    }

}
