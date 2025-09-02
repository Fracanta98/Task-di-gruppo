public final class Models {
    public static class Libro {
    private String titolo;
    private String autore;
    private int anno;
    private boolean disponibile = true;



    public Libro(String titolo, String autore, int anno, boolean disponibile){
    this.titolo = titolo;
    this.autore = autore;
    this.anno = anno;
    this.disponibile = disponibile;
}

@Override
public String toString() {
    return getTitolo() + " " + getAutore() + " " + getAnno(); //override di toString altrimenti java
                                                              //con il suo formato  
}



public String getTitolo(){return titolo;}
public String getAutore(){return autore;}
public int getAnno(){return anno;}
public boolean isDisponibile() {return disponibile;}


public String SetTitolo(String nuovoTitolo){return this.titolo = nuovoTitolo;}
public String setAutore(String nuovoAutore){return this.autore = nuovoAutore;}
public int setAnno(int nuovoAnno){return this.anno = nuovoAnno;}
public void setDisponibile(boolean disponibile) {this.disponibile = disponibile;}



}


public static class Utente {
    private String nome;
    private String id;

    public Utente(String nome, String id){
        this.nome = nome;
        this.id = id;
    }

    public String getNome(){return nome;}
    public String getId(){return id;}

    public String setNome(String nuovoNome){return this.nome = nuovoNome;}
    public String setId(String nuovoId){return this.id = nuovoId;}
    
    
}

}
