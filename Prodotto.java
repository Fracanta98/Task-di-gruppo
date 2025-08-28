public class Prodotto {
    private String nome;
    private double prezzoBase;



    public Prodotto(String nome, double prezzoBase){
        this.nome = nome;
        this.prezzoBase = prezzoBase;
    }


    public void calcolaPrezzoFinale(){
        System.out.println("Prezzo: " + prezzoBase);
    }

    public String getNome(){
        return nome;
    }

    public double getPrezzoBase(){
        return prezzoBase;
    }

}
