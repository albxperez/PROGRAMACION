
    import javax.swing.*;
    public class DiagramaNotas2 {
        public static void main(String[] args) {
            String texto= JOptionPane.showInputDialog("Introduzca su nota");
            double n=Double.parseDouble(texto);
            if(n<=3){
                System.out.println("Muy deficiente");
                JOptionPane.showMessageDialog(null,"Muy Deficiente");
            }else{
                if (n>3 && n<5){
                    System.out.print("Suspenso");
                    JOptionPane.showMessageDialog(null,"Suspenso");
                }else{
                    if(n>=5 && n<7){
                        System.out.print("Bien");
                        JOptionPane.showMessageDialog(null,"Bien");
                    }else{
                        if(n>=7 && n<9){
                            System.out.print("Notable");
                            JOptionPane.showMessageDialog(null,"Notable");
                        }else{
                            if(n>9 && n<10){
                                System.out.print("Sobresaliente");
                                JOptionPane.showMessageDialog(null,"Sobresaliente");
                            }else{ System.out.print("Matricula de Honor");
                                JOptionPane.showMessageDialog(null,"Matricula de Honor");
                            }
                        }
                    }

                }
            }
        }
    }

