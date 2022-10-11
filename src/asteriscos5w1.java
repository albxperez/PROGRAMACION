import java.util.Scanner;
public class asteriscos5w1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero; ");
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            for (int n = 0; n < i; n++) {
                System.out.print(" ");
            }
                System.out.print("*");
            System.out.println("");

        }
    }}
