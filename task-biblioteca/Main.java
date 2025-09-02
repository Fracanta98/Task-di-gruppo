
import java.util.ArrayList;
import java.util.Arrays;


public class Main {
    public static void main(String[] args){

    Biblioteca a = new Biblioteca(); //questo è un oggetto che contiene tutti i metodi e quindi anche l'array del file biblioteca

    Libro l1 = new Libro("hunger", "suzanne", 2010);
    a.aggiungiLibro(l1);
    Libro l2 = new Libro("Obscur", "Sandfall", 2025);
    a.aggiungiLibro(l2);

    // a.visualizzaLibri();

    a.ricercaPerTitolo("hunger");
    



    }




}