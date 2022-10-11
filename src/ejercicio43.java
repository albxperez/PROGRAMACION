import java.util.Scanner;

public class ejercicio43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m= sc.nextInt();
        int n = 2;
        int cont=0;
        int acum =1;
        while (cont<5)  {
            boolean primo=true;
            int i=2;
            while (i<n){
                if (n%i==0){
                    primo=false;
                }
            i++;
        }
       if (primo==true){
           acum *=n;
           cont++;
       }
       n++;
        }
        System.out.println("+acum");
        }
    }

