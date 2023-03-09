
package zsuga.futtat;

import zsuga.Pakli;


public class kartya_feladat {
    
    public static void main(String[] args){
        int lapszam = Integer.parseInt(args[0]);
        int hanyKartya = Integer.parseInt(args[1]);
        
        Pakli pakli;
        if(lapszam > 0){
            pakli = new Pakli(lapszam, Math.random() < 0.5);
        } else {
            pakli = new Pakli();
        }
        
        pakli.osszesLap();
        System.out.println(pakli);
        
        System.out.println("A játék eredménye: " + pakli.blackJackLight(hanyKartya));
        
    }
    
}
