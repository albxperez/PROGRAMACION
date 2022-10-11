import java.util.Scanner;

public class Meses2 {

        public static void main(String[] args) {

            Scanner sc= new Scanner(System.in);
            Integer m;
            Integer a;
            System.out.print("Introduzca número del mes: ");
            m = sc.nextInt();
            System.out.print("Introduzca año: ");
            a = sc.nextInt();

            switch (m) {
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

            if((a%4 == 0 && a%100 != 0 ) || (a%100 == 0 && a%400 == 0)) {
                System.out.println("Año Bisiesto");
            }else{
                System.out.println("Año no Bisiesto");
            }
        }
}



