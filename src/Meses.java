import java.util.Scanner;
public class Meses {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        String dias;
        Integer n;
        System.out.print("Introduzca número del mes: ");
        dias = sc.nextLine();
        n = Integer.parseInt(dias);


        switch (n) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31 dias");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30 dias");
                break;
            case 2:
                System.out.println("28 dias");
                break;
        }
    }
}
