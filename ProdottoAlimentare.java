public class ProdottoAlimentare extends Prodotto {
    private int dataScadenza;
    public double PrezzoFinale;

    // cotruttore
    public ProdottoAlimentare(String nome, double prezzoBase, int dataScadenza){
        super(nome,prezzoBase);
        this.dataScadenza = dataScadenza;

    }

    // metodo get
    public int GetdataScadenza(){
        return dataScadenza;
    }

    // metodo set 

    public int SetdataScadenza(int nuovadata){
        return this.dataScadenza = nuovadata;
    }
    @Override
    public void calcolaPrezzoFinale(){
        if(dataScadenza<3){
            PrezzoFinale= getPrezzoBase()- (getPrezzoBase()*20/100);
            System.out.println("La data di scadenza è inferiore a 3 giorni, il prezzo finale è :" + PrezzoFinale);                                                                                  

        }
        else{
            PrezzoFinale = getPrezzoBase();
            System.out.println("Il prezzo fianle è :" + PrezzoFinale );


        }
    }
    
}
