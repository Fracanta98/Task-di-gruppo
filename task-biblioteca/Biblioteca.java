import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class Biblioteca {

    
    
    ArrayList<Libro> libri = new ArrayList<>();




    public void aggiungiLibro(Libro nuovoLibro){
        libri.add(nuovoLibro);
    }

    // public void visualizzaLibri(){
    //     for(Libro libro: libri )
    //     System.out.println(libro.getTitolo() + libro.getAutore() + libro.getAnno());
        
    // }

   public void ricercaPerTitolo(String tit){
         Libro risultatoRicerca = null;//array di appoggio
        for(Libro libro: libri){
            if(libro.getTitolo().trim().equalsIgnoreCase(tit.trim())){
                risultatoRicerca = libro;
                break;
                
            }
        }
        System.out.println("Libro: " + risultatoRicerca);
   
        }
}
