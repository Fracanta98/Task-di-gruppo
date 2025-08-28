import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        ArrayList <Prodotto> Prodotti = new ArrayList<>();


        ProdottoElettronico pe1 = new ProdottoElettronico("tv", 300, true);
        Prodotti.add(pe1);
        ProdottoElettronico pe2 = new ProdottoElettronico("tv", 300, true);
        Prodotti.add(pe2);
        ProdottoElettronico pl1 = new ProdottoLibro("Hunger Games Trilogy", 300, true);
        Prodotti.add(pl1);
        ProdottoElettronico pl2 = new ProdottoLibro("Clai obscur Expedition 33", 50, true);
        Prodotti.add(pl2);
        

        System.out.println("Premi 1 per aggiungere prodotto alimentare");
        System.out.println("Premi 2 per aggiungere prodotto elettronico");
        System.out.println("Premi 3 per aggiungere libro");
        System.out.println("Premi 0 per uscire");

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        switch (a) {
            case 1:
                System.out.println("Selezionato prodotto alimentare");
                break;


            case 2:
                System.out.println("Selezionato prodotto elettronico");

                break;


            case 3:


                break;


        
            default 0:
                break;
        }




    }
    
}
