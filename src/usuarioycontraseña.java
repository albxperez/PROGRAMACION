import java.util.Scanner;

public class usuarioycontraseña {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Introduzca nombre de usuario: ");
        //sc.nextInt();
       // int usuario;
        String contrasena = ("DAWArturoSoria22"), intentos ;
        int cont= 0 ;
        Scanner teclado = new Scanner(System.in);
        do{
            System.out.println("Introduzca contraseña: ");
        intentos = teclado.nextLine();
        if (contrasena.equals(intentos)) {
            System.out.println("Acceso permitido!");
            cont = 3;
        } else {
            System.out.print("Contraseña incorrecta!!");
            cont ++;
                    if(cont == 3){
                        System.out.print("Acceso denegado!!");

                    }
        }
        }while (cont != 3);
    }}