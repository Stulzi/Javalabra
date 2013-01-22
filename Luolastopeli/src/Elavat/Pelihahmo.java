package Elavat;

public class Pelihahmo implements Elollinen{

    private String nimi;
    private int maxHP;
    private int nykyinenHP;
    private int voima;
    private int puolustus;
    private int maxSP;
    private int nykyinenSP;
    
    public Pelihahmo(int maxHP, int maxSP, int voima, int puolustus){
        this.nimi= "You";
        this.maxHP=maxHP;
        this.maxSP=maxSP;
        this.voima=voima;
        this.puolustus=puolustus;
        this.nykyinenHP=maxHP;
        this.nykyinenSP=maxSP;
    }
    
    @Override
    public void vähennäNykyistaHP(int maara) {
        if(maara<1){
            return;
        }
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
        if(maara<1){
            return;
        }
        this.nykyinenSP=nykyinenSP-maara;
    }
    
    public void paranna(){
        this.nykyinenHP=this.maxHP;
        this.nykyinenSP=this.maxSP;
    }
    
    public void lisaaHP(int maara){
        if (maara<1){
            return;
        }
        this.maxHP=maxHP+maara;
    }
    
    public void lisaaSP(int maara){
        if(maara<1){
            return;
        }
        this.maxSP=maxSP+maara;
    }
    
    public void lisaaVoimaa(int maara){
        if(maara<1){
            return;
        }
        this.voima=voima+maara;
    }
    
    public void lisaaPuolustusta(int maara) {
        if(maara<1){
            return;
        }
        this.puolustus=puolustus+maara;
    }

    @Override
    public String annaNimi() {
        return this.nimi;
    }

    
    
}
