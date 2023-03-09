
package zsuga;


public class Pakli {
    private Kartya[] kartyak;
    private final boolean jokerPiros;
    
    public Pakli (int maxLapszam, boolean isPiros){
        jokerPiros = isPiros;
        kartyak = new Kartya[maxLapszam];
        genLapok;
    }
    
    public Pakli(){
        this(52, false);
    }
    
    private void genLapok(){
        for (int i =0; i < kartyak.length; i++){
            int ertek = (int)Math.floor(Math.random() * 13 + 2);
            boolean isPiros = Math.random() < 0.5;
        }
    }
    
    public Kartya getKartya(int idx){
        if(idx > kartyak.length -1 || idx <0){
            return new Kartya();
        } else return kartyak[idx];
    }
    
    public int getLapszam(){
        return kartya.length;
    }

    @Override
    public String toString() {
        return kartyak.length + "lapos pakli, joker: " + (jokerPiros ? "piros" : "fekete");
    }
    
    public int blackJackLight(int hanyLap){
        if(hanyLap > kartyak.length){
            hanyLap = kartyak.length;
        }
        if (hanyLap < 0){
            hanyLap = 0;
        }
        int ossz = 0;
        
        for (int i = 0; i < hanyLap; i++){
            if (kartyak[i].isIsPiros() == jokerPiros){
                ossz += kartyak[i].getErtek();
            } else {
                ossz += Math.ceil(kartyak[i].getErtek() / 2.0)
            }         
        }
    return ossz;
    }
    
    public int blackJackLight( Kartya k){
        int idx = kartyak.length;
        
        for (int i = 0; i < kartya.length; i++){
            if(kartyak[i].isIsPiros() == k.isIsPiros() && kartyak[i].getErtek() ==k.getErtek()){
                idx = i + 1;
                break;
            }
        }
        return blackJackLight(idx);
    }
    public void egyszinuPakli(){
        for (int i = 0; i < kartyak.length; i++){
            System.out.println(kartyak[i]);
        }
    }
}
    
