import javax.swing.*;
public class DiagramaNotas {
    public static void main(String[] args) {
        String texto=JOptionPane.showInputDialog("Introduzca su nota");
        double n=Double.parseDouble(texto);
            if(n<=3){
                System.out.println("Muy deficiente");
            }else{
                if (n>3 && n<5){
                    System.out.print("Suspenso");
                }else{
                    if(n>=5 && n<7){
                        System.out.print("Bien");
                    }else{
                        if(n>=7 && n<9){
                            System.out.print("Notable");
                        }else{
                            if(n>9 && n<10){
                              System.out.print("Sobresaliente");
                        }else{ System.out.print("Matricula de Honor");
                    }
                }
            }

    }
}
    }
}
