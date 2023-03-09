
package zsuga;


public class Kartya {
    private int ertek;
    private boolean isPiros;
    
    public Kartya(int ertek, boolean is Piros){
        if (ertek>= 2 && ertek <= 14){
            this.ertek = ertek;
        } else {this.ertek = 2;}
       this.isPiros = is Piros;
    }
    
    public Kartya(){
        this (0, true);
    }

    public int getErtek() {
        return ertek;
    }

    public void setErtek(int ertek) {
        if(ertek>=2 && ertek <= 14){
            this.ertek = ertek;
        }    
    }
    public boolean isIsPiros(){
        return isPiros;
    }

    public void setIsPiros(boolean isPiros) {
        this.isPiros = isPiros;
    }

    @Override
    public String toString() {
        return (isPiros ? "piros" : "fekete") + ertek;
    }
}
