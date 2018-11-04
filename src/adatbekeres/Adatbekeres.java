
package adatbekeres;

import java.util.Scanner;


public class Adatbekeres {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //1.feladat
     /*   System.out.println("  Kérem adja meg a medence átmérőjét (m):  ");
        double atmero = sc.nextDouble();
        System.out.println("  Kérem adja meg a medence magasságát (m):  ");
        double magassag = sc.nextDouble();
        
        //double medenceFelszin = atmero/2*atmero/2*3.14;
        double medenceFelszin = Math.pow(atmero/2,2)*Math.PI;
        double terfogat = medenceFelszin * magassag;
        System.out.println("A medence térfogata: "+Math.round(terfogat*100)/100.0);
        */
     
        //2.feladat
        System.out.println("Kérem adja meg a szoba szélességét (m): ");
        double szelesseg = sc.nextDouble();
        
        System.out.println("Kérem adja meg a szoba magasság (m): ");
         double magassag = sc.nextDouble();
         
         double felulet = szelesseg*magassag; 
         double csempeFelulet = 20*20;
         
         long db = Math.round(felulet*100*100*1.1/csempeFelulet);
         String s = 
                 String.format("a %.2f cm2 területű falfelületnek"
                 + "a csempézéséhez %d db csempe szükséges:",felulet, db);
         System.out.println(s);
         //3.feladat
         double valosPozitivSzam;
        do{
            System.out.println("Kérem adjon meg egy valós pozitiv szamot: ");
            valosPozitivSzam = sc.nextDouble();
            
            
        }while(valosPozitivSzam < 0);
        
        System.out.println(
        String.format("A megadott szám %d és %d egéz számok között van és ezek %d"
                + "A szám egész része: %d \n"
                + "A szám törtrésze %f*\n",
                (int)Math.floor(valosPozitivSzam),
                (int)Math.ceil(valosPozitivSzam),
                (int)Math.round(valosPozitivSzam),
                (int)Math.floor(valosPozitivSzam),
                valosPozitivSzam*Math.floor(valosPozitivSzam))
        );



    }
    
}
