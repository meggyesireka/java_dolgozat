
package feladat1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Feladat1 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        int a;
        int b;
        int c;        
        
        System.out.print("Téglatest 'a' oldala: ");
        a = Integer.parseInt(br.readLine());
        
        System.out.print("Téglatest 'b' oldala: ");
        b = Integer.parseInt(br.readLine()); 
        
        System.out.print("Téglatest 'c' oldala: ");
        c = Integer.parseInt(br.readLine());
                
        System.out.println("Térfogat: " +(a*b*c));
       
    }
    
}
