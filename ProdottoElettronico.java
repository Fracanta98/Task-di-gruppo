public class ProdottoElettronico extends Prodotto {
    private boolean garanzia;
    
    public ProdottoElettronico(String name, double prezzoBase, boolean garanzia){
        super(name, prezzoBase);
        this.garanzia = garanzia;
    }


    @Override
    public void calcolaPrezzoFinale(){
        if(garanzia = true){
           double Prezzofinale = getPrezzoBase() + (getPrezzoBase()*0.10);
           System.out.println("Prezzo: " + Prezzofinale);
        }else{
        System.out.println("Prezzo: " + getPrezzoBase());
    }
    }

    public boolean switchGaranzia(){
        return garanzia = !garanzia;
    }
    
    public double setPrezzoBase( double nuovoPrezzoBase){
        return nuovoPrezzoBase = getPrezzoBase();
    }

    public double setPrezzoFinale(double prezzoFinale){
        
          if(garanzia = true){

            return prezzoFinale = getPrezzoBase() + (getPrezzoBase()*0.10);
           
        }else{
            return prezzoFinale = getPrezzoBase();
    }

    }
}
