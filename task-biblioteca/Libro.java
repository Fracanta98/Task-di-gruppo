public class Libro {
    private String titolo;
    private String autore;
    private int anno;
    private boolean disponibile;



public Libro(String titolo, String autore, int anno, boolean disponibile){
    this.titolo = titolo;
    this.autore = autore;
    this.anno = anno;
    this.disponibile = true;
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


