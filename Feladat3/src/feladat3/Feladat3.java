
package feladat3;


public class Feladat3 {

  
    public static void main(String[] args) {
        if ( args.length < 2) {
            System.out.println("Nem megfelelo szamu parameter !");
            System.exit(0);
        }
        
        int n = Integer.parseInt ( args [0]) ;
        int [] array = new int[args.length - 1];
        for( int i = 1; i < args.length; i++) {
            array [i -1]= Integer.parseInt (args[i]) ;
        }
        
        int result = add (array, n);
            System.out.println("A kivalasztott elemek osszege :" + result) ;
        }
    
    public static int add (int [] array , int n ) {
        int sum =0;
        for( int i =0; i < array.length ; i += n ) {
            sum += array [i];
        }
        return sum ;
        }
    }
