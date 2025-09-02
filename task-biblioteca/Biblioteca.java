import java.util.ArrayList;
import java.util.Arrays;



public class Biblioteca {

    
    
    ArrayList<Libro> libri = new ArrayList<>();




    public void aggiungiLibro(Libro nuovoLibro){
        libri.add(nuovoLibro);
    }

    public void visualizzaLibri(){
        for(Libro libro: libri )
        System.out.println(libro.getTitolo() + libro.getAutore() + libro.getAnno());
        
    }
    
}
