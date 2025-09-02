public class ProdottoLibro extends Prodotto {
    private boolean studente;

    public ProdottoLibro(String nome, double prezzoBase, boolean studente){
    super (nome, prezzoBase);
    this.studente = studente;
}

@Override
public void calcolaPrezzoFinale(){
    if(studente = true) {
           double Prezzofinale = getPrezzoBase() - (getPrezzoBase()*0.15);
           System.out.println("Prezzo: " + Prezzofinale);
        }else{
        System.out.println("Prezzo: " + getPrezzoBase());
    }
    }

    public boolean switchStudente(){
        return studente = !studente;
    }
}