import java.util.Scanner;
public class nºcifras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer n;//numero
        Integer x=0;//cifras
        System.out.print("Introduzca un número: ");
        n = sc.nextInt();
        while(n>0) {
            n=n/10;
            x++;
        }
        System.out.print("El numero intruducido tiene " +x+" cifras");
        }
    }


