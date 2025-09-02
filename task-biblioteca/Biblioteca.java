import java.util.ArrayList;
import java.util.Arrays;



public class Biblioteca {

    ArrayList<Libro> libri = new ArrayList<>();




    public void aggiungiLibro(Libro nuovoLibro){
        libri.add(nuovoLibro);
    }

    public void visualizzaLibri(){
        System.out.println(libri);
    }
    
}
