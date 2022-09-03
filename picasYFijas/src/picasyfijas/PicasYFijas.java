package picasyfijas;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class PicasYFijas {
    public static void main(String[] args) {
       numero();
    }
    public static void numero() {
        Scanner input = new Scanner(System.in);
         int[]clave=new int[4];
         int pica=0;
         int fija=0;
         int[] adivinado=new int[4];
         int x=Integer.parseInt(JOptionPane.showInputDialog("digite el numero a adivinar"));
         for (int i = 3; i >= 0; i--) {
             clave[i]=x%10;
             x=x/10;
             System.out.println(clave[i]);
             }
         do {
             fija=0;
             pica=0;
           int y=Integer.parseInt(JOptionPane.showInputDialog("adivina el numero"));
           for (int i = 3; i >= 0; i--) {
             adivinado[i]=y%10;
             y=y/10;
             System.out.println(adivinado[i]);
             }
           if(clave[0]==adivinado[0])
           {
               fija+=1;
           }
           else
           {
             if(clave[0]==adivinado[1])
           {
               pica+=1;
           }  
             else
             {
                if(clave[0]==adivinado[2])
           {
               pica+=1;
           }  
                else
                {
                    if(clave[0]==adivinado[3])
           {
               pica+=1;
           }  
                } 
             }
           }
           if(clave[1]==adivinado[0])
           {
               pica+=1;
           }
           else
           {
             if(clave[1]==adivinado[1])
           {
               fija+=1;
           }  
             else
             {
                if(clave[1]==adivinado[2])
           {
               pica+=1;
           }  
                else
                {
                    if(clave[1]==adivinado[3])
           {
               pica+=1;
           }  
                } 
             }
           }
           if(clave[2]==adivinado[0])
           {
               pica+=1;
           }
           else
           {
             if(clave[2]==adivinado[1])
           {
               pica+=1;
           }  
             else
             {
                if(clave[2]==adivinado[2])
           {
               fija+=1;
           }  
                else
                {
                    if(clave[2]==adivinado[3])
           {
               pica+=1;
           }  
                } 
             }
           }if(clave[3]==adivinado[0])
           {
               pica+=1;
           }
           else
           {
             if(clave[3]==adivinado[1])
           {
               pica+=1;
           }  
             else
             {
                if(clave[3]==adivinado[2])
           {
               pica+=1;
           }  
                else
                {
                    if(clave[3]==adivinado[3])
           {
               fija+=1;
           }  
                } 
             }
           }
           if(fija==4)
           {
               JOptionPane.showConfirmDialog(null, "Felicidades adivinaste el numero");
           }
           else{
           JOptionPane.showMessageDialog(null, "picas: "+pica+"y fiajas: "+fija);}
           
        } while (fija!=4);
    }
    
}
