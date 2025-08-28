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
    
}
