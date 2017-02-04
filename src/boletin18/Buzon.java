
package boletin18;

import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;


public class Buzon {
    private ArrayList <Correo>Buzon;

    
    
    public Buzon (){
        Buzon = new ArrayList <Correo>(); 
    }
    
    public String meterMensaxe(){
        String mensaxe=JOptionPane.showInputDialog("Escribe o teu mensaxe para enviar: ");
        return mensaxe;
    }
    public void engadirCorreo(){
        Correo c=new Correo();
        
        c.setMensaxe(meterMensaxe());
        Buzon.add(c);
    }
    public void calcularNumCorreos(){
      System.out.println("Correos totales " + Buzon.size());
    }
    public void porLer(){
        Correo mail=new Correo();
        int contar=0;
       for(int i=0;i<Buzon.size();i++){
           mail=Buzon.get(i);
           if(mail.isLido()==false)
               contar++;
       }
        System.out.println("Correos por ler: "+contar);
    }
    
    public void Amosa(int k){//Amosa o último correo esté lido ou non
        Correo mail=new Correo();
        mail=Buzon.get(k);
        mail.setLido(true);
        System.out.println("Correo elixido: " +mail.getMensaxe()); 
    }
    
    
    public void amosaPrimerNoLeido(){
        Correo mail=new Correo();
        int i=Buzon.size();
        boolean existe;
        do{
            i--;
            existe=Buzon.contains(i);
            System.out.println("--" +existe);
            if(existe)
                mail=Buzon.get(i);
            
        }while(mail.isLido()==true && existe==true);
        if(existe){
        System.out.println("Primeiro correo non lido: " + mail.getMensaxe());
        mail.setLido(true);
        }
    }
    
    public void primerNONlid(){
        Correo mail=new Correo();
        int i=Buzon.size();
       
        do{
            
            i--;
            mail=Buzon.get(i);
            
        }while(mail.isLido()==true || i==0);
        if(i>=0){
        
        System.out.println("Primeiro correo non lido: " + mail.getMensaxe());
        mail.setLido(true);
        }
        else
            System.out.println("Non hai mensaxes que mostrar");
        
          
}
    public void elimina(int k){
        Buzon.remove(k);
        System.out.println("Correo "+ k +" eliminado");
    }
}

