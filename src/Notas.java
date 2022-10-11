
import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {

    Scanner sc= new Scanner(System.in);//se crea un objeto tipo scanner
    String nota;
    Double n;
    System.out.print("Introduzca la nota del examen: ");
    nota = sc.nextLine();//leer un dato
     n =Double.parseDouble(nota);
            if(n<=3){
        System.out.println("Muy deficiente");
    }else if (n>3 && n<5){
            System.out.print("Suspenso");
        }else if(n>=5 && n<7){
                System.out.print("Bien");
            }else if(n>=7 && n<9){
                    System.out.print("Notable");
                }else if(n>9 && n<10){
                        System.out.print("Sobresaliente");
                    }else{ System.out.print("Matricula de Honor");
                    }
                }
            }
