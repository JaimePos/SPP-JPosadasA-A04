package spp.jposadasa.a04;
import java.util.Scanner;
/**
 *
 * @author Jaime Jr
 */
public class SPPJPosadasAA04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner kb = new Scanner (System.in);
        double res;
        int dec;
        
        System.out.println("Bienvenido a la calculadora Trigonometrica");
        System.out.println("Porfavor elija la opcion deseada");
        System.out.println("1. Seno");
        System.out.println("2. Coseno");
        System.out.println("3. Tangente");
        
        dec = kb.nextInt();
        
        switch (dec) {
            case 1:
                System.out.println("Bienvenido a la calculadora de Senos");
                res = Math.sin(decAng());
                System.out.println("Seno: " + res);
                
            case 2:
                System.out.println("Bienvenido a la calculadora de Cosenos");
                res = Math.sin(decAng());
                System.out.println("Seno: " + res);
            case 3:
                System.out.println("Bienvenido a la Calculadora de Tangentes");
                res = Math.sin(decAng());
                System.out.println("Seno: " + res);
        }
    }
    
    static double decAng (){
        Scanner kb = new Scanner (System.in);
        double ang, rad;
        System.out.println("Porfavor introduzca el angulo");
                ang = kb.nextDouble();
                rad = ang*Math.PI/180;
                return rad;
    }
}    

