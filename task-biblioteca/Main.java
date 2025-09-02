
import java.util.ArrayList;
import java.util.Arrays;


public class Main {
    public static void main(String[] args){

    BibliotecaService a = new BibliotecaService(); //questo è un oggetto che contiene tutti i metodi e quindi anche l'array del file biblioteca

    Models.Libro l1 = new Models.Libro("hunger", "suzanne", 2010, true);
    a.aggiungiLibro(l1);
    Models.Libro l2 = new Models.Libro("Obscur", "Sandfall", 2025, true);
    a.aggiungiLibro(l2);

    // a.visualizzaLibri();

    // a.ricercaPerTitolo("hunger");
    



    }




}