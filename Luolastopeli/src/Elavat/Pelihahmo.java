package Elavat;

public class Pelihahmo implements Elollinen{
    
    private int maxHP;
    private int nykyinenHP;
    private int voima;
    private int puolustus;
    private int maxSP;
    private int nykyinenSP;
    
    public Pelihahmo(int maxHP, int maxSP, int voima, int puolustus){
        this.maxHP=maxHP;
        this.maxSP=maxSP;
        this.voima=voima;
        this.puolustus=puolustus;
        this.nykyinenHP=maxHP;
        this.nykyinenSP=maxSP;
    }
    
    @Override
    public void vähennäNykyistaHP(int maara) {
        this.nykyinenHP=nykyinenHP-maara;
    }

    @Override
    public int annaVoima() {
        return this.voima;
    }

    @Override
    public boolean onkoElossa() {
        if (this.nykyinenHP<1){
            return false;
        }
        return true;
    }

    @Override
    public int annaPuolustus() {
        return this.puolustus;
    }
    
    public void vahennaNykyistäSP(int maara){
        this.nykyinenSP=nykyinenSP-maara;
    }
    
    public void paranna(){
        this.nykyinenHP=this.maxHP;
        this.nykyinenSP=this.maxSP;
    }
    
    public void lisaaHP(int maara){
        this.maxHP=maxHP+maara;
    }
    
    public void lisaaSP(int maara){
        this.maxSP=maxSP+maara;
    }
    
    public void lisaaVoimaa(int maara){
        this.voima=voima+maara;
    }
    
    public void lisaaPuolustusta(int maara) {
        this.puolustus=puolustus+maara;
    }

    
    
    
    
}
