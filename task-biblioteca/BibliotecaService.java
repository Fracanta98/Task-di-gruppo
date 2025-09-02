import java.util.ArrayList;

public class BibliotecaService {
     ArrayList<Models.Libro> libri = new ArrayList<>();




    public void aggiungiLibro(Models.Libro nuovoLibro){
        libri.add(nuovoLibro);
    }

    // public void visualizzaLibri(){
    //     for(Libro libro: libri )
    //     System.out.println(libro.getTitolo() + libro.getAutore() + libro.getAnno());
        
    // }

   public void ricercaPerTitolo(String tit){
         Models.Libro risultatoRicerca = null;//array di appoggio
        for(Models.Libro libro: libri){
            if(libro.getTitolo().trim().equalsIgnoreCase(tit.trim())){
                risultatoRicerca = libro;
                break;
                
            }
        }
        System.out.println("Libro: " + risultatoRicerca);
   
        }

    public boolean prestaLibro(String titolo, Models.Utente utente) {
        for (Models.Libro libro : libri) {
            if (libro.getTitolo().equalsIgnoreCase(titolo) && libro.isDisponibile()) {
                libro.setDisponibile(false);
                System.out.println("OK" + utente.getNome() + " ha preso in prestito \"" + libro.getTitolo() + "\"");
                return true;
            }
        }
        System.out.println("NO Libro \"" + titolo + "\" non disponibile!");
        return false;
    }


    public void mostraLibriDisponibili() {
        System.out.println("Libri disponibili:");
        for (Models.Libro libro : libri) {
            if (libro.isDisponibile()) {
                System.out.println("- " + libro.getTitolo() + " di " + libro.getAutore());
            }
        }
    }

    public boolean restituisciLibro(String titolo, Models.Utente utente) {
        for (Models.Libro libro : libri) {
            if (libro.getTitolo().equalsIgnoreCase(titolo) && libro.isDisponibile()) {
                libro.setDisponibile(true);
                System.out.println("OK" + utente.getNome() + " ha restituito \"" + libro.getTitolo() + "\"");
                return true;
            }
        }
        System.out.println("NO Libro \"" + titolo + "\" non restituito!");
        return false;
    }
    
}
