public class Libro {
    private String titolo;
    private String autore;
    private int anno;



public Libro(String titolo, String autore, int anno){
    this.titolo = titolo;
    this.autore = autore;
    this.anno = anno;
}


public String getTitolo(){return titolo;}
public String getAutore(){return autore;}
public int getAnno(){return anno;}


public String SetTitolo(String nuovoTitolo){return this.titolo = nuovoTitolo;}
public String setAutore(String nuovoAutore){return this.autore = nuovoAutore;}
public int setAnno(int nuovoAnno){return this.anno = nuovoAnno;}



}


