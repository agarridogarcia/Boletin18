
package boletin18;

import javax.swing.JOptionPane;


public class Boletin18 {

    
    public static void main(String[] args) {
        Buzon listaCorreo =new Buzon();
       
        int opcion;
        
        do{ 
            opcion=Integer.parseInt(JOptionPane.showInputDialog("MENÚ \n1.Meter novo correo \n2.Número de correos que temos \n3.Correos NON lidos \n4.Amosar un email \n5.Último correo non lido \n6.Eliminar correo \n7.Sair " ));
       
            switch(opcion){
                case 1:listaCorreo.engadirCorreo();
                       break;
                case 2:listaCorreo.calcularNumCorreos();
                    break;
                case 3:listaCorreo.porLer();
                    break;
                case 4:listaCorreo.Amosa(Integer.parseInt(JOptionPane.showInputDialog("Qué nº de correo queres ler?")));
                    
                    break;
                case 5:listaCorreo.primerNONlid();
                    break;
                case 6:listaCorreo.elimina(Integer.parseInt(JOptionPane.showInputDialog("Qué nº de correo queres eliminar?")));
                    break;
                case 7:System.exit(0);
                    
                    
                       
            }       
        }while(opcion<7);
    
}
}
