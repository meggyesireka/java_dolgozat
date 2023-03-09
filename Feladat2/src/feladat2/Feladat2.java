
package feladat2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Feladat2 {
   
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        int csucs;
        int oldal;      
        
        System.out.print("A sokszög csúcsainak száma: ");
        csucs = Integer.parseInt(br.readLine());
        
        System.out.print("Egy oldal hosszúsága: ");
        oldal = Integer.parseInt(br.readLine()); 
        
        
        if (args.length !=2 ) {
            System.out.println("Nem megfelelő szamú paraméter!");
            System.exit(0);
        }
        
        int n = Integer.parseInt(args[0]);
        int length = Integer.parseInt(args[1]);
        int result = 0;
        for (int i= 0; i<n; i++){
            result = result + length;
        }
        System.out.println("A sokszög kerülete: " + result);
        
        
        
    }
    
}
